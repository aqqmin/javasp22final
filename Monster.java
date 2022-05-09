package monsterdungeon;

public class Monster extends Character 
{
	Gem prize;
	Monster(int hpMax, int stamMax, int manMax)
	{
		this.hpMax = hpMax;
		this.hp = hpMax;
		this.stamMax = stamMax;
		this.stam = stamMax;
		this.manMax = manMax;
		this.mana = manMax;
		prize = new Gem(this);
	}
}