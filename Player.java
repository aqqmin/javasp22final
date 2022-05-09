package monsterdungeon;
import monsterdungeon.Character;
public class Player extends Character 
{
	
	Player(int hpMax, int hp, int stamMax, int stam, int manMax, int mana)
	{
		this.hpMax = hpMax;
		this.hp = hp;
		this.stamMax = stamMax;
		this.stam = stam;
		this.manMax = manMax;
		this.mana = mana;
	}
	
	public void Use(Gem gem)
	{
		if(gem.bigGem == false)
		{
			this.hp += gem.hp;
			this.stam += gem.stam;
			this.mana += gem.mana;
		}
		if(gem.fullHeal)
		{
			this.hp=this.hpMax;
			this.stam=this.stamMax;
			this.mana=this.manMax;
		}
		else
		{
			this.hpMax += gem.hp;
			this.stamMax += gem.stam;
			this.manMax += gem.mana;
		}
	}
	
}
