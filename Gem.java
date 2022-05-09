package monsterdungeon;

public class Gem extends World {
	int hp;
	int stam;
	int mana;
	boolean fullHeal;
	boolean bigGem;

	Gem(Monster monster)
	{
		this.hp = monster.hp / 3;
		this.stam = monster.stam / 7;
		this.mana = monster.mana / 7;
	}
	
}
