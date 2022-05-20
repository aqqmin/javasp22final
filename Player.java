package monsterdungeon;
import monsterdungeon.Character;
public class Player {

	//By Payton Bayron. More than open to suggestions for additions!
	
	private String name;
	
	private int healthMax;
	private int manaMax;
	private int staminaMax;
	
	private int healthCurrent;
	private int manaCurrent;
	private int staminaCurrent;
	
	// ---- Stat Maximum Getters and Setters ----
	
	// ---- Health Max ----
	public int getHealthMax()
	{
		return healthMax;
	}
	
	public void setHealthMax(int newHealthMax)
	{
		healthMax = newHealthMax;
	}
	// ---- Mana Max ----
	public int getManaMax()
	{
		return manaMax;
	}
	
	public void setManaMax(int newManaMax)
	{
		manaMax = newManaMax;
	}
	// ---- Stamina Max ----
	public int getStaminaMax()
	{
		return staminaMax;
	}
	
	public void setStaminaMax(int newStaminaMax)
	{
		staminaMax = newStaminaMax;
	}
	
	// ---- Stat Current Getters and Setters ----
	
	// ---- Health Current ----
	public int getHealthCurrent()
	{
		return healthCurrent;
	}
	
	public void setHealthCurrent(int newHealthCurrent)
	{
		healthMax = newHealthCurrent;
	}
	// ---- Mana Current ----
	public int getManaCurrent()
	{
		return manaCurrent;
	}
	
	public void setManaCurrent(int newManaCurrent)
	{
		manaCurrent = newManaCurrent;
	}
	// ---- Stamina Max ----
	public int getStaminaCurrent()
	{
		return staminaCurrent;
	}
	
	public void setStaminaCurrent(int newStaminaCurrent)
	{
		staminaMax = newStaminaCurrent;
	}
	
	// ---- Name ----
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
}
