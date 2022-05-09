package monsterdungeon;


public class World extends Utility 
{
	
	Player player = new Player(10, 10, 10, 10, 10, 10);
	Battle battle;
	World()
	{
		
	}
	public void DoBattle()
	{
		this.battle = new Battle(this.player, RandMonGen());
		this.player = battle.BattleTime();
	}
	

}
