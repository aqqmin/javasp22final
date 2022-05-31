package dungeonzero;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.Sequencer;

public class Utility
	{
	static Printer printer;
	static Menu menu;
	static RandomGenerator randGen;
	
	Utility()
	{
	printer = new Printer();
	menu = new Menu();
	randGen = new RandomGenerator();
	//public static Music music = new Music();
	}
	
	
	//used to print file contents to terminal
	public class Printer
	{
		void PrintFile(String path) throws FileNotFoundException
		{
			File file = new File(path);
			Scanner input = new Scanner(file);
			while (input.hasNextLine())
			{
				System.out.println(input.nextLine());
			}
			input.close();

		}
	}
	//Primary UI driver
	//calls all printing and gets all input, methods return integer control codes
	public class Menu
	{
		public int BattleMenu(Player player, Monster monster)
		{
			String[] playerInfo = player.getOutputInfo();
			String[] monsterInfo = monster.getOutputInfo();
			return 0;
		}
		public int WorldMenu(Player player) {
			// TODO Auto-generated method stub
			return 0;
		}
		public String NameMenu()
		{
			String name = "";
			return name;
		}
		public int[] StatsMenu()
		{
			int[] choices = new int[3];
			return choices;
		}
	}
	//provides random ints in a range for all sorts of control functions, we have a RandomGenerator standing by in the public space of the Utility
	
	public class RandomGenerator
	{
		public int Generate(int min, int max)
		{
			return 0;
		}
		
	}
}
	
	//plays midi files in the world
	/* public class Music
	{
		//creates sequencer device
		Sequencer sequencer = MidiSystem.getSequencer();
		
		// Opens the sequencer device
        sequencer.open();
        
		Play(String path);
		
		{		
			BufferedInputStream is;
			// create a data stream(midi) from a URL to prepare data for Finale class execution
			try {
				File file = new File(path)
				is = new BufferedInputStream(file).openStream());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 			        
	        // Sets the sequence on which the sequencer operates, must be a MIDI stream
	        sequencer.setSequence(is);
	     
	        // Starts playback of the MIDI data in the currently loaded sequence
	        sequencer.start();
		}

}
*/
