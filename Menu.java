package dungeonzero;

    //Primary UI driver
	//calls all printing for questions to the user and gets all input, methods return integer control codes
public class Menu {
	public static int BattleMenu(Player player, Monster monster)
	{
		String[] playerInfo = player.getOutputInfo();
		String[] monsterInfo = monster.getOutputInfo();
		return 2;
	}
	public static int WorldMenu(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static String NameMenu()
	{
		String name = "RickAst";
		return name;
	}
	public static int[] StatsMenu()
	{
		int[] choices = new int[]{100,100,100};
		return choices;
	}
}
