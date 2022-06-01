package dungeonzero;

public class Battle {
	
	protected Player player;
	protected Monster monster;
	protected boolean battling;
	
	
	Battle(Monster monster)
	{
		this.player = World.player;
		this.monster = monster;
		this.battling = true;
	
	}
	
	public void BattleLoop()
	{
		while(battling)
		{
			System.out.print("\n\n");
			System.out.println(this.player.getHp());
			System.out.println(this.monster.getHp());
			PlayerTurn();
			if(DoneCheck()) {battling=false;}
			System.out.print("\n\n");
			System.out.println(this.player.getHp());
			System.out.println(this.monster.getHp());
			MonsterTurn();
			if(DoneCheck()) {battling=false;}
			Wait.Wait(500);			
		}
		if(this.player.getHp() <= 0)
		{
			World.Death();
		}
		if(this.monster.getHp()<=0)
		{
			Gem gem = new Gem(this.monster);
			this.player.UseGem(gem);
			World.setPlayer(this.player);
		}
		
	}
	protected void PlayerTurn()
	{
		System.out.println("Player Turn!\n");
		
		//int choice = Menu.BattleMenu(this.player, this.monster);
		//Ability abilityChoice = new Ability("heal" , 3, 3, 1, 1, 0, 1, 0, 1, 0);//player.abilities[choice];
		Ability abilityChoice = new Ability("greater harm - Hp" , 1, 11, 1, 1, 0, 1, 3, 1, 0);
		UseAbility(player, monster, abilityChoice, 0);		
	}
	protected void MonsterTurn()
	{
		//int choice = Random.RandInt(0, this.monster.getAbilities().length);
		Ability abilityChoice = new Ability("harm - Hp", 1, 11, 1, 1, 1 , 1, 3, 1, 0);//this.monster.getAbilities()[choice];
		UseAbility(monster, player, abilityChoice, 1);
	}
	protected boolean DoneCheck()
	{
		System.out.println("checking if done : "+this.player.getHp());
		if(this.player.getHp() <= 0)
		{
			System.out.println("Done!!!");
			return true;
		}
		if(this.monster.getHp()<=0)
		{
			System.out.println("Done!!!");
			return true;
		}
		return false;
	}
	
	protected void UseAbility(Character user, Character target, Ability ability, int origin)
	{
		
		System.out.println("\n"+user.getName() +" uses " + ability.getName());
		int[] effectArray = AbilityCalculator.Calculate(ability, user, target);
		EffectParser(effectArray, origin);
		
	}
	protected void EffectParser(int[] effectArray, int origin)
	{
		System.out.println("Parsing...\n");
		//Switches based on who was using the ability to correctly route cost and effect values
		switch(origin)
						
		{
		//player origin
		case 0:
			
			//switches between 3 possible cost targets, Hp Mana and Stam for player
			switch(effectArray[0])
			{
			case 0:
				this.player.setHp(this.player.hp + effectArray[1]);
				System.out.println("player health cost "+Integer.toString(effectArray[1]));
				break;
			
			case 1:
				this.player.setMana(this.player.mana + effectArray[1]);
				System.out.println("player mana cost "+Integer.toString(effectArray[1]));
				break;
			
			case 2:
				this.player.setStam(this.player.stam + effectArray[1]);
				System.out.println("player stam cost "+Integer.toString(effectArray[1]));
				break;
			}
			
			//Switches between 6 possible effect targets, Hp Mana and Stam for each player and monster
			switch(effectArray[2])
			{
			case 0:
				this.player.setHp(this.player.hp + effectArray[3]);
				System.out.println("player health effect "+Integer.toString(effectArray[3]));
				break;
			case 1:
				this.player.setMana(this.player.mana + effectArray[3]);
				System.out.println("player mana effect "+Integer.toString(effectArray[3]));
				break;
			case 2:
				this.player.setStam(this.player.stam + effectArray[3]);
				System.out.println("player stam effect "+Integer.toString(effectArray[3]));
				break;
			case 3:
				this.monster.setHp(this.monster.hp + effectArray[3]);
				System.out.println("monster  health effect "+Integer.toString(effectArray[3]));
				break;
			case 4:
				this.monster.setMana(this.monster.mana + effectArray[3]);
				System.out.println("monster  mana effect "+Integer.toString(effectArray[3]));
				break;
			case 5:
				this.monster.setStam(this.monster.stam + effectArray[3]);
				System.out.println("monster  stam effect "+Integer.toString(effectArray[3]));
				break;
			}
			break;
			
		//Monster origin
		case 1:
			
			//switches between 3 possible cost targets, Hp Mana and Stam for monster
			switch(effectArray[0])
			{
			case 0:
				this.monster.setHp(this.monster.hp + effectArray[1]);
				System.out.println("monster  hp cost"+Integer.toString(effectArray[1]));
				break;
			
			case 1:
				this.monster.setMana(this.monster.mana + effectArray[1]);
				System.out.println("monster  mana cost"+Integer.toString(effectArray[1]));
				break;
			
			case 2:
				this.monster.setStam(this.monster.stam + effectArray[1]);
				System.out.println("monster  stam cost"+Integer.toString(effectArray[1]));
				break;
			}
			//Switches between 6 possible effect targets, Hp Mana and Stam for each monster and player
			switch(effectArray[2])
			{
			case 0:
				this.monster.setHp(this.monster.hp + effectArray[3]);
				System.out.println("monster  health effect "+Integer.toString(effectArray[3]));
				break;
			case 1:
				this.monster.setMana(this.monster.mana + effectArray[3]);
				System.out.println("monster  mana effect "+Integer.toString(effectArray[3]));
				break;
			case 2:
				this.monster.setStam(this.monster.stam + effectArray[3]);
				System.out.println("monster  stam effect "+Integer.toString(effectArray[3]));
				break;
			case 3:
				this.player.setHp(this.player.hp + effectArray[3]);
				System.out.println("player  hp effect "+Integer.toString(effectArray[3]));
				break;
			case 4:
				this.player.setMana(this.player.mana + effectArray[3]);
				System.out.println("player  mana effect "+Integer.toString(effectArray[3]));
				break;
			case 5:
				this.player.setStam(this.player.stam + effectArray[3]);
				System.out.println("player  stam effect "+Integer.toString(effectArray[3]));
				break;
			}
			break;
		}
	}

	public void endBattling() {
		System.out.println("Changed battling!");
		this.battling = false;
	}

	public boolean isBattling() {
		return battling;
	}
	
	
	}
