package dungeonzero;

public class Player extends Character {
	
	
	
	Player(String name, int maxHp, int maxMana, int maxStam, Ability[] abilities)
	{
		super(name, maxHp, maxMana, maxStam, abilities);
	}
	public void UseGem(Gem gem)
	{
		System.out.println("using        a                  ;GEM");
		switch(gem.getType())
		{
		case 0:
			super.setMaxHp(maxHp+gem.getHp());
			break;
		case 1:
			super.setMaxMana(maxMana+gem.getMana());
			break;
		case 2:
			super.setMaxStam(maxStam+gem.getStam());
			break;
		}
	}

}
