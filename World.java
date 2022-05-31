package dungeonzero;

public class World {
	private static boolean playing = true;
	private static Player player;
	private Ability[] allAbilities = InitiateAbilities();
	private Battle currentBattle;
	World()
	{
		//two separate threads play a title sequence and load resources
		TitleThread titleThread = new TitleThread();
		LoadingThread loadingThread = new LoadingThread();
		titleThread.run();
		loadingThread.run();
		IntializePlayer(Utility.menu.NameMenu(), Utility.menu.StatsMenu());
		WorldLoop();		
		
	}
	
	//gives world menu option to battle again or quit or print something random until static variable playing = false
	public void WorldLoop()
	{
		while(playing)
		{
			int choice = Utility.menu.WorldMenu(this.player);
			switch (choice)
			{
			case 0:
				
				Monster monster = MonsterMaker(Utility.randGen.Generate(0, 5));
				Battle currentBattle = new Battle(player, monster);
			case 1:
				System.out.println("random print");
			case 9:
				World.playing = false;
			}
		}	
	}
	
	
	
	public Monster MonsterMaker(int mons)

	{
		String name = "";
		//int HP = 0 ;
		int max_HP = 0;
		//int mana = 0;
		int max_mana = 0;
		//int stamina = 0;
		int max_stamina = 0;
		Ability[] abilities = allAbilities;
		
		switch(mons) {
        //Mons will insitatie base stats based on a randomized integer passed to it
        //that determines the type of mons it is.

       case 0:
           name = "Blood Wraith";
           //HP = 20; 
           max_HP = 20;
           //mana = 30; 
           max_mana = 30;
           //stamina = 10; 
           max_stamina = 10;
       case 1:
           name = "Golum";
           //HP = 25; 
           max_HP = 25;
           //mana = 5; 
           max_mana = 5;
           //stamina = 20; 
           max_stamina = 20;
       case 2:
           name = "Hellhound";
           //HP = 20; 
           max_HP = 20;
           //mana = 10; 
           max_mana = 10;
           //stamina = 25; 
           max_stamina = 25;
       case 3:
           name = "Skellie";
           //HP = 15; 
           max_HP = 15;
           //mana = 10; 
           max_mana = 10;
           //stamina = 25; 
           max_stamina = 25;
       case 4:
           name = "Ragdoll";
           //HP = 25; 
           max_HP = 25;
           //mana = 20; 
           max_mana = 20;
           //stamina = 25; 
           max_stamina = 25;
   }
		
		return new Monster(name, max_HP, max_mana, max_stamina, abilities);
	}
	
	//Queries user at startup what player stats they want(so you can kindof save your game by remembering your stats
	//or just fiddle around with the experience by changing these parameters
	
	public void IntializePlayer(String name, int[] choices)
	{
		
		player = new Player(name, choices[0], choices[1], choices[2], allAbilities);
	}
	
	
	//creates abilities and makes a master array allAbilities
	public Ability[] InitiateAbilities()
	{
		Ability[] allAbilities = new Ability[] 
		{
		new Ability("heal" , 3, 1, 1, 1, 0, 3, 1, 1, 0),
		new Ability("harm - Hp", 1, 11, 1, 1, 0 , 1, 11, 1, 0),
		new Ability("harm -Stam", 5, 7, 1, 1, 0 , 5, 7, 1, 0)
		};
		return allAbilities;
	
	}
	//allows to set player from anywhere in program, as player is static
	public void setPlayer(Player player) {
		World.player = player;
	}
	
	
	//Carter created this title screen intro print sequence
	public void TitleScreen() throws InterruptedException {

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("==========================");
        System.out.println("\\");
        Thread.sleep(250);
        System.out.println(" \\");
        Thread.sleep(250);
        System.out.println("  \\");
        Thread.sleep(250);
        System.out.println("  /");
        Thread.sleep(250);
        System.out.println(" /");
        Thread.sleep(250);
        System.out.println("/");
        Thread.sleep(250);
        System.out.println("Deep under the earth");
        System.out.println("\\");
        Thread.sleep(250);
        System.out.println(" \\");
        Thread.sleep(250);
        System.out.println("  \\");
        Thread.sleep(250);
        System.out.println("    \\");
        Thread.sleep(250);
        System.out.println("      \\");
        Thread.sleep(250);
        System.out.println("      /");
        Thread.sleep(250);
        System.out.println("     /");
        Thread.sleep(250);
        System.out.println("    /");
        Thread.sleep(250);
        System.out.println("   /");
        Thread.sleep(250);
        System.out.println("  /");
        Thread.sleep(250);
        System.out.println(" /");
        Thread.sleep(250);
        System.out.println("\\");
        Thread.sleep(250);
        System.out.println(" \\");
        Thread.sleep(250);
        System.out.println("Deep underground");
        System.out.println("     _____  ");
        System.out.println("    ( ◍  ◍ ) ");
        System.out.println("     乁ꈍꈍꈍㄏ      ");
        Thread.sleep(250);
        System.out.println("     /");
        Thread.sleep(250);
        System.out.println("    /");
        Thread.sleep(250);
        System.out.println("   /");
        Thread.sleep(250);
        System.out.println(" /");
        Thread.sleep(250);
        System.out.println("/");
        Thread.sleep(250);
        System.out.println("The greatest peril awaits!");
        System.out.println("\\");
        Thread.sleep(250);
        System.out.println(" \\");
        Thread.sleep(250);
        System.out.println("  \\");

        Thread.sleep(250);
        System.out.println("    \\");
        Thread.sleep(250);
        System.out.println("      \\");
        Thread.sleep(250);
        System.out.println("       in");
        System.out.println("     /");
        Thread.sleep(250);
        System.out.println("    /");
        Thread.sleep(250);
        System.out.println("   /");
        Thread.sleep(250);
        System.out.println(" /");
        Thread.sleep(250);
        System.out.println("/");
        Thread.sleep(250);
        System.out.println("THE");
        System.out.println(" ▄▄▄▄▄▄▄ ▄▄▄▄▄▄ ▄▄   ▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄    ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄    ▄▄▄▄▄▄  ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄   ▄▄ ");
        System.out.println("█       █      █  █ █  █       █       █  █       █       █  █      ██       █       █  █▄█  █");
        System.out.println("█       █  ▄   █  █▄█  █    ▄▄▄█  ▄▄▄▄▄█  █   ▄   █    ▄▄▄█  █  ▄    █   ▄   █   ▄   █       █");
        System.out.println("█     ▄▄█ █▄█  █       █   █▄▄▄█ █▄▄▄▄▄   █  █ █  █   █▄▄▄   █ █ █   █  █ █  █  █ █  █       █");
        System.out.println("█    █  █      █       █    ▄▄▄█▄▄▄▄▄  █  █  █▄█  █    ▄▄▄█  █ █▄█   █  █▄█  █  █▄█  █       █");
        System.out.println("█    █▄▄█  ▄   ██     ██   █▄▄▄ ▄▄▄▄▄█ █  █       █   █      █       █       █       █ ██▄██ █");
        System.out.println("█▄▄▄▄▄▄▄█▄█ █▄▄█ █▄▄▄█ █▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█  █▄▄▄▄▄▄▄█▄▄▄█      █▄▄▄▄▄▄██▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█▄█   █▄█");


    }
	
	//these threads carry out the title and loading, executing both at the same time(see lines 10-13)
	//allowing us to instance and load any resources we need while the user is distracted
	
	  public class TitleThread extends Thread {

		    public void run(){
		       try {
				TitleScreen();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		  }
	  public class LoadingThread extends Thread {

		    public void run(){
		       InitiateAbilities();
		    }
		  }
	public static void setPlaying(boolean playing) {
		World.playing = playing;
	}
}
	
