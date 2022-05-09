package monsterdungeon;

public class Character extends World 
{
	String name;
	protected int id;
	protected int hpMax;
	protected int hp;
	protected int stamMax;
	protected int stam;
	protected int manMax;
	protected int mana;
	

	public int gethpMax() {
		return hpMax;
	}
	public int gethp() {
		return hp;
	}
	public int getstamMax() {
		return stamMax;
	}
	public int getstam() {
		return stam;
	}
	public int getmanMax() {
		return manMax;
	}
	public int getMan() {
		return mana;
	}
	public void sethpMax(int hpMax) {
		hpMax = hpMax;
	}
	public void sethp(int hp) {
		hp = hp;
	}
	public void setstamMax(int stamMax) {
		stamMax = stamMax;
	}
	public void setstam(int stam) {
		stam = stam;
	}
	public void setmanMax(int manMax) {
		manMax = manMax;
	}
	public void setMan(int mana) {
		mana = mana;
	}
}
