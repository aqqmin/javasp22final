package monsterdungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Utility extends Game
{
	static Menu menu;
	static Printer printer;

	Utility() {
		Menu menu = new Menu();
		Printer printer = new Printer();
	}


	public class Menu
	{
		public int BatMenu(String prompt)
		{
			Scanner menuScnr = new Scanner(System.in);
			int choice = 0;
			do //start of menu loop
			{
				System.out.println("testing: we are in the menu!"); //FIXME
				System.out.println("0 - to quit out");
				System.out.println(prompt);
				choice = menuScnr.nextInt();


			} while (choice == 0);
			menuScnr.close();
			return choice;
		}
		public int AbilityMenu(String prompt)
	  {
			System.out.println("We are in the ability menu"); //FIXME
			Scanner menuScnr = new Scanner(System.in);
			int choice;

		}

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
