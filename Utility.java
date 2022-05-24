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
			System.out.println("HP: " + character.gethp());
			System.out.println("Stamina: " + character.getstam());
			System.out.println("Mana: " + character.getMan());
		}

	}
	//we will need a method for generating a random int within a range
	static int RandNumGen(int min, int max)
		{
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			return random_int;
		}

		static Monster RandMonGen()
		{
			int maxHP = RandNumGen(1, 100);
			int maxStam = RandNumGen(1, 100);
			int maxMana = RandNumGen(1, 100);
			Monster newMonster = new Monster(maxHP, maxStam, maxMana);
			return newMonster;
		}

		static Gem RandGemGen()
		{
			int hp = RandNumGen(1, 100);
			int stam = RandNumGen(1, 100);
			int mana = RandNumGen(1, 100);
			Gem newGem = new Gem();
			newGem.setHP(hp);
			newGem.setStam(stam);
			newGem.setMana(mana);
			return newGem;
		}

}
