package dungeonzero;

public class Gem {
	int hp;
	int stam;
	int mana;
	int type;

	Gem(Monster monster)
	{
		hp = monster.getHp() / 3;
		stam = monster.getStam() / 5;
		mana = monster.getMana() / 5;
		type = Utility.randGen.Generate(0, 3);
	}

	public int getHp() {
		return hp;
	}

	public int getStam() {
		return stam;
	}

	public int getMana() {
		return mana;
	}

	public int getType() {
		return type;
	}

}
