package dungeonzero;

public class Battle {
	
	Player player;
	Monster monster;
	
	
	Battle(Player player, Monster monster)
	{
		this.player = player;
		this.monster = monster;
		BattleLoop();
	
	}
	
	protected void BattleLoop()
	{
		
	}
	
	protected void UsePlayerAbility(Character player, Character monster, Ability ability)
	{
		AbilityCalculator(ability, player, monster);			
	}
		
	
	protected void UseMonsterAbility(Character monster, Character player)
	{
		Ability[] monsterAbilities = monster.getAbilities();
		Ability ability = monsterAbilities[Utility.randGen.Generate(0, monsterAbilities.length)];
		AbilityCalculator(ability, monster, player);
		
		
	}
	
	protected void AbilityCalculator(Ability ability, Character user, Character target)
	{
		int resultAmt1;
		int resultAmt2;
		
		//different arithmetic expressions create different stats comparison dynamics, expression are generalized to compare
		//stat1 and stat2, regardless of what stats are encoded in the ability as stat 1 and stat2
		
		switch (ability.getOperatorCode())
		{
		case 0:
			
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
		
		case 5:
		
		case 6:
		
		case 7:
			
		}
		
		//this switch carries out the change of the user stat based on calculations above and an integer switch in the ability
		
		switch(ability.getResultStat1())
		{
		case 0:
			
		case 1:
		
		case 2:
			
		}
		
		//this switch carries out the change of the target(or user) stat based on calculations above and an integer switch in the ability
		switch(ability.getResultStat2())
		{
		case 0:
			returnVal = this.player.getHp();
		case 1:
			returnVal = this.player.getMaxHp();
		case 2:
			returnVal = this.player.getMana();
		case 3:
			returnVal = this.player.getMaxMana();
		case 4:
			returnVal = this.player.getStam();
		case 5:
			returnVal = this.player.getMaxStam();
		case 6:
			returnVal = this.monster.getHp();
		case 7:
			returnVal = this.monster.getMaxHp();
		case 8:
			returnVal = this.monster.getMana();
		case 9:
			returnVal = this.monster.getMaxMana();
		case 10:
			returnVal = this.monster.getStam();
		case 11:
			returnVal = this.monster.getMaxStam();
		}
		return returnArr;
		
	}
	
	
	//returns the value of the stat selected by the stat code, used to parse any instance of a stat selection in an ability
	//has 12 cases, 1 each for the current and max value of each stat for both monster and player in the current battle
	//cases are in this order:
	/*
	 * 
	 */
	protected int StatValue(int statCode)
	{	
		int returnVal = 0;
		switch (statCode)
		{
			case 0:
				returnVal = this.player.getHp();
			case 1:
				returnVal = this.player.getMaxHp();
			case 2:
				returnVal = this.player.getMana();
			case 3:
				returnVal = this.player.getMaxMana();
			case 4:
				returnVal = this.player.getStam();
			case 5:
				returnVal = this.player.getMaxStam();
			case 6:
				returnVal = this.monster.getHp();
			case 7:
				returnVal = this.monster.getMaxHp();
			case 8:
				returnVal = this.monster.getMana();
			case 9:
				returnVal = this.monster.getMaxMana();
			case 10:
				returnVal = this.monster.getStam();
			case 11:
				returnVal = this.monster.getMaxStam();
		}
		return returnVal;
	}
		
		
		
	}
