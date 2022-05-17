package monsterdungeon;

import monsterdungeon.Character.*;

public class Battle
{
	Player player;
	Monster monster;
	boolean battling = true;
	World world;

	Battle(Player player, Monster monster)
	{
		this.player = player;
		this.monster = monster;
	}
	public Player BattleTime()
	{
		while (battling)
		{
			PlayerTurn();
			MonsterTurn();
		}
		player.Use(monster.gem);
		return player;
	}
	private void MonsterTurn()
	{
		Utility.printer.PrintFile(BatFrameTop.txt);
		Utility.printer.PrintStat(this.monster);
		Utility.printer.PrintStat(this.player);
		Utility.printer.PrintFile(BatFrameBot.txt);
		int choiceCode = RandNumGen(0,2);


		switch (choiceCode) //Monsters controller interface
		{
		case 0:
			Attack(this.monster, this.player);
			break;

		case 1:
			Defend(player);
			break;

			case 2:
			MonsterAbility(monster);
			break;
		}

		if (this.player.getHp() <= 0 )
		{
			GameOver();
		}
		if (this.monster.getHp() <= 0)
		{
			Victory();
		}
	}
	private void PlayerTurn()
	{
		Utility.printer.PrintFile(BatFrameTop.txt);
		Utility.printer.PrintStat(this.monster);
		Utility.printer.PrintStat(this.player);
		Utility.printer.PrintFile(BatFrameBot.txt);

		int choiceCode = Utility.menu.BatMenu("0==[ [1] attack  [2] defend  [3] use ability ==>");
		//BatMenu prints a prompt and returns an int, which is saved in choiceCode

		case (choiceCode) //player control interface
		{
		case 1:
			Attack(this.player, this.monster);
			break;
		case 2:
			Defend(player);
			break;
		case 3:
			PlayerAbility(player, Utility.menu.AbilityMenu(player));
			break;
		}

		if (this.player.getHp() <= 0 )
		{
			GameOver();
		}
		if (this.monster.getHp() <= 0)
		{
			Victory();
		}
	}
}
