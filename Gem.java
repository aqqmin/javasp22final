package monsterdungeon;

public class Gem extends World {
	int hp;
	int stam;
	int mana;
	boolean fullHeal;
	boolean bigGem;
	Gem(){

	}
	Gem(Monster monster)
	{
		this.hp = monster.hp / 3;
		this.stam = monster.stam / 7;
		this.mana = monster.mana / 7;
	}
	public int getHP() { return this.hp; }
	public void setHP(int hp) { this.hp = hp; }
	public int getStam() {return this.stam; }
	public void setStam(int stam) { this.stam = stam; }
	public int getMana() {return this.mana; }
	public void setMana(int mana) { this.stam = mana; }
	public boolean getFullHeal() { return this.fullHeal; }
	public void setFullHeal(boolean isFull) { this.fullHeal = isFull; }
	public boolean getBigGem() { return this.bigGem; }
	public void setBigGem(boolean isBig ) {this.bigGem = isBig; }
	
}
