package dungeonzero;

public class Player extends Character {
	
	
	
	Player(String name, int maxHp, int maxMana, int maxStam, Ability[] abilities)
	{
		super(name, maxHp, maxMana, maxStam, abilities);
	}
	public void UseGem(Gem gem)
	{
		switch(gem.getType())
		{
		case 0:
			super.setMaxHp(maxHp+gem.getHp());
		case 1:
			super.setMaxMana(maxMana+gem.getMana());
		case 2:
			super.setMaxStam(maxStam+gem.getStam());
		}
	}

}
