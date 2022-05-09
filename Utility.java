package monsterdungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Utility extends Game
{
	static Menu menu;
	static Printer printer;
	
	Utility()
	{
		Menu menu = new Menu();
		Printer printer = new Printer();
	}
	public class Menu
	{
		
	}
	
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
		void PrintStat(Character character)
		{
			
		}
		
	}
	//we will need a method for generating a random int within a range
	static int RandNumGen(int floor, int celing)
	{
		
	}
	
	static Monster RandMonGen()
	{
		
	}
	
	static Item RandItemGen()
	{
		
	}
	
}
