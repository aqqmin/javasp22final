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
		if (choiceCode = 0)
		{
			Attack(this.monster, this.player);
		}
		if (choiceCode = 1)
		{
			Defend(player);
		}
		if (choiceCode = 2)
		{
			MonsterAbility(monster);
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
		int choiceCode = Utility.menu.BatMenu();
		if (choiceCode = 0)
		{
			Attack(this.player, this.monster);
		}
		if (choiceCode = 1)
		{
			Defend(player);
		}
		if (choiceCode = 2)
		{
			PlayerAbility(player, Utility.menu.AbilityMenu(player));
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
