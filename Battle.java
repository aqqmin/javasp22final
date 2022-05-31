package dungeonzero;

public class Battle {
	
	protected Player player;
	protected Monster monster;
	protected boolean battling;
	
	
	Battle(Player player, Monster monster)
	{
		this.player = player;
		this.monster = monster;
		this.battling = true;
		BattleLoop();
	
	}
	
	protected void BattleLoop()
	{
		while(battling)
		{
			PlayerTurn();
			MonsterTurn();
		}
		
		
	}
	protected void PlayerTurn()
	{
		int choice = Utility.menu.BattleMenu(this.player, this.monster);
		Ability abilityChoice = this.player.getAbilities()[choice];
		UseAbility(player, monster, abilityChoice);		
		DoneCheck();
	}
	protected void MonsterTurn()
	{
		int choice = Utility.randGen.Generate(0, this.monster.getAbilities().length);
		Ability abilityChoice = this.monster.getAbilities()[choice];
		UseAbility(monster, player, abilityChoice);
		DoneCheck();
	}
	protected void DoneCheck()
	{
		if(this.player.getHp() <= 0)
		{
			battling = false;
		}
		if(this.monster.getHp()<=0)
		{
			Gem gem = new Gem(this.monster);
			player.UseGem(gem);
			World.setPlayer(player);
			battling = false;
		}
	}
	
	protected void UseAbility(Character user, Character target, Ability ability)
	{
		System.out.println(user.getName() +" uses " + ability.getName() + " on " + target.getName());
		AbilityCalculator(ability, user, target);			
		
	}
	//returns the value of the stat selected by the stat code, used to parse any instance of a stat selection in an ability
	//has 12 cases, 1 each for the current and max value of each stat for both monster and player in the current battle
	//cases are in this order:
	protected int StatValue(Character user, Character target, int statCode)
	{	
		int returnVal = 0;
		switch (statCode)
		{
			case 0:
				returnVal = user.getHp();
			case 1:
				returnVal = user.getMaxHp();
			case 2:
				returnVal = user.getMana();
			case 3:
				returnVal = user.getMaxMana();
			case 4:
				returnVal = user.getStam();
			case 5:
				returnVal = user.getMaxStam();
			case 6:
				returnVal = target.getHp();
			case 7:
				returnVal = target.getMaxHp();
			case 8:
				returnVal = target.getMana();
			case 9:
				returnVal = target.getMaxMana();
			case 10:
				returnVal = target.getStam();
			case 11:
				returnVal = target.getMaxStam();
		}
		return returnVal;
	}
	
	protected void AbilityCalculator(Ability ability, Character user, Character target)
	{
		
		
		//result amounts 1 and 2 are the variables we store the adjustment values for stat 1 and stat 2 while we carry out the calculations and changes
		int costAmt = 0;
		int effectAmt = 0;
		//getting coefficients
		int coef1 = ability.getStatCoef1();
		int coef2 = ability.getStatCoef2();
		//getting comparison stat values
		int statVal1 = StatValue(user, target, ability.getStatCode1());
		int statVal2 = StatValue(user, target, ability.getStatCode2());
		
		
		//different arithmetic expressions create different stats comparison dynamics, expression are generalized to compare
		//stat1 and stat2, regardless of what stats are encoded in the ability as stat 1 and stat2
		boolean doing = true;
		while(doing)
		{
			switch (ability.getOperatorCode())
			{
			//basic  
			case 0:
				int factor = statVal1 / statVal2;
				
				costAmt = ((statVal1) / 10) * coef1 ;
				effectAmt = (statVal1/10 + (statVal1 * factor)/10) * coef2 ;
				
			case 1:
				costAmt = 0 ;
				effectAmt = 0 ;
				
			case 2:
				costAmt = 0 ;
				effectAmt = 0 ;
				
			case 3:
				costAmt = 0 ;
				effectAmt = 0 ;
				
			case 4:
				costAmt = 0 ;
				effectAmt = 0 ;
			
			case 5:
				costAmt = 0 ;
				effectAmt = 0 ;
			
			case 6:
				costAmt = 0 ;
				effectAmt = 0 ;
			
			case 7:
				costAmt = 0 ;
				effectAmt = 0 ;
				
			}
			
			//this switch carries out the change of the user stat based on calculations above and an integer switch in the ability
			
			switch(ability.getResultStat1())
			{
			case 0:
				System.out.println("It costs " + Integer.toString(costAmt) + " Health!" );
				if(user.getHp() < costAmt)
				{
					System.out.println("can't afford it!");
					doing = false;
				}
				else
				{
					this.player.setHp(user.getHp()- costAmt);
				}
					
			case 1:
				System.out.println("It costs " + Integer.toString(costAmt) + " Mana!" );
				if(user.getMana() < costAmt)
				{
					System.out.println("can't afford it!");
					doing = false;
				}
				else
				{
					this.player.setMana(user.getMana()- costAmt);
				}
			case 2:
				System.out.println("It costs " + Integer.toString(costAmt) + " Stamina!" );
				if(user.getStam() < costAmt)
				{
					System.out.println("can't afford it!");
					doing = false;
				}
				else
				{
					this.player.setStam(user.getStam()- costAmt);
				}
			}
			
			//this switch carries out the change of the target(or user) stat based on calculations above and an integer switch in the ability
			switch(ability.getResultStat2())
			{
			case 0:
				this.player.setHp(target.getHp()+effectAmt);
				System.out.println("It heals Health by " + Integer.toString(effectAmt));
			case 1:
				this.player.setMana(target.getMana()+effectAmt);
				System.out.println("It heals Mana by " + Integer.toString(effectAmt));
			case 2:
				this.player.setStam(target.getStam()+effectAmt);
				System.out.println("It heals Stamina by " + Integer.toString(effectAmt));
			case 3:
				this.monster.setHp(target.getHp()+effectAmt);
				System.out.println("It damages Health by " + Integer.toString(effectAmt));
			case 4:
				this.monster.setMana(target.getMana()+effectAmt);
				System.out.println("It damages Mana by " + Integer.toString(effectAmt));
			case 5:
				this.monster.setStam(target.getStam()+effectAmt);
				System.out.println("It damages Stamina by " + Integer.toString(effectAmt));
			}
		}
	}
	
	
		
		
		
	}
