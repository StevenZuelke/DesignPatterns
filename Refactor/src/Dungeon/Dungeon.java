package Dungeon;

/**
 * Title: Dungeon.java
 *
 * Description: Driver file for Heroes and Monsters project
 *
 * Copyright:    Copyright (c) 2001
 * Company: Code Dogs Inc.
 * I.M. Knurdy
 *
 * History:
 *  11/4/2001: Wrote program
 *    --created DungeonCharacter class
 *    --created Hero class
 *    --created Monster class
 *    --had Hero battle Monster
 *    --fixed attack quirks (dead monster can no longer attack)
 *    --made Hero and Monster abstract
 *    --created Warrior
 *    --created Ogre
 *    --made Warrior and Ogre battle
 *    --added battleChoices to Hero
 *    --added special skill to Warrior
 *    --made Warrior and Ogre battle
 *    --created Sorceress
 *    --created Thief
 *    --created Skeleton
 *    --created Gremlin
 *    --added game play features to Dungeon.java (this file)
 *  11/27/2001: Finished documenting program
 * version 1.0
 */



/*
  This class is the driver file for the Heroes and Monsters project.  It will
  do the following:

  1.  Allow the user to choose a hero
  2.  Randomly select a monster
  3.  Allow the hero to battle the monster

  Once a battle concludes, the user has the option of repeating the above

*/
public class Dungeon
{
	/*added
    public static void main(String[] args)
	{

		Hero theHero;
		Monster theMonster;

		do
		{
		    theHero = chooseHero();
		    theMonster = generateMonster();
			battle(theHero, theMonster);

		} while (playAgain());

    }//end main method

/*-------------------------------------------------------------------
chooseHero allows the user to select a hero, creates that hero, and
returns it.  It utilizes a polymorphic reference (Hero) to accomplish
this task
---------------------------------------------------------------------*/
	/* added
	public static Hero chooseHero()
	{
		int choice;
		Hero theHero;

		System.out.println("Choose a hero:\n" +
					       "1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief");
		choice = Keyboard.readInt();

		/*
		switch(choice)
		{
			case 1: return new Warrior();

			case 2: return new Sorceress();

			case 3: return new Thief();

			default: System.out.println("invalid choice, returning Thief");
				     return new Thief();
		}//end switch

		 
		return null;
	}//end chooseHero method

/*-------------------------------------------------------------------
generateMonster randomly selects a Monster and returns it.  It utilizes
a polymorphic reference (Monster) to accomplish this task.
---------------------------------------------------------------------*/
/* added
	public static Monster generateMonster()
	{
		int choice;

		choice = (int)(Math.random() * 3) + 1;

		/*
		switch(choice)
		{
			case 1: return new Ogre();

			case 2: return new Gremlin();

			case 3: return new Skeleton();

			default: System.out.println("invalid choice, returning Skeleton");
				     return new Skeleton();
		}//end switch
		 
		return null;
	}//end generateMonster method*/

/*-------------------------------------------------------------------
playAgain allows gets choice from user to play another game.  It returns
true if the user chooses to continue, false otherwise.
---------------------------------------------------------------------*/
	/* added
	public static boolean playAgain()
	{
		char again;

		System.out.println("Play again (y/n)?");
		again = Keyboard.readChar();
		return (again == 'Y' || again == 'y');
	}//end playAgain method


/*-------------------------------------------------------------------
battle is the actual combat portion of the game.  It requires a Hero
and a Monster to be passed in.  Battle occurs in rounds.  The Hero
goes first, then the Monster.  At the conclusion of each round, the
user has the option of quitting.
---------------------------------------------------------------------*/
	/* added
	public static void battle(Hero theHero, Monster theMonster)
	{
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");

		//do battle
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
		{
		    //hero goes first
			theHero.battleChoices(theMonster);

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
			    theMonster.attack(theHero);

			//let the player bail out if desired
			System.out.print("\n-->q to quit, anything else to continue: ");
			pause = Keyboard.readChar();

		}//end battle loop

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");

	}//end battle method
*/
	Hero theHero;
	private String finalRoom[][];
	
	public String[][] makeRooms()
	{
		String roomSize[][] = new String[5][5];
		return roomSize;
			
	}
	/*      c0 c1 c2 c3 c4
	 * [enter] [] [] [] [] //r0
	 *      [] [] [] [] [] //r1
	 *      [] [] [] [] [] //r2
	 *      [] [] [] [] [] //r3
	 *      [] [] [] [] [exit] //r4
	 */
	public String[][] roomSetup()//adding entrance,exit and 4 pillars
	{
		Room objectList = new Room();
		
		String[][] dungeonRooms = makeRooms(); // empty 2D 5x5 to add items
		int totalPillars = 0;
		
		dungeonRooms[0][0] = "Entrance";
		objectList.addItem(0);
		
		dungeonRooms[4][4] = "Exit";
		objectList.addItem(1);
		
		while(totalPillars < 4)
		{
			int row = (int)(Math.random()*4)+0;
			int col = (int)(Math.random()*4)+0;
			if(row != 0 && col != 0 || dungeonRooms[row][col].isEmpty())
			{
			dungeonRooms[row][col] = "Pillar";
			objectList.addItem(6);
			totalPillars++;
			}
		}
		
		
		for(int rows = 0; rows < dungeonRooms.length;rows++)
		{
			for(int columns = 0; columns < dungeonRooms[columns].length; columns++)
			{
				if(rows != 0 && columns != 0 || dungeonRooms[rows][columns].isEmpty())
				{	
				  int num = (int)(Math.random()*5)+2;
				  if(num == 2) {
					  dungeonRooms[rows][columns] = "HP";
					  objectList.addItem(num);
				  }
				  
				  if(num == 3){
					  dungeonRooms[rows][columns] = "VP";
					  objectList.addItem(num);
				  }
				  
				  if(num == 4){
					  dungeonRooms[rows][columns] = "Pit";
					  objectList.addItem(num);
				  }
				  
				  if(num == 5){
					  dungeonRooms[rows][columns] = "Monster";
					  objectList.addItem(num);
				  }
				}
			}	
		}	
		this.finalRoom = dungeonRooms;
		return dungeonRooms;
	}
	
	public String heroLocation()//maintains location of hero in dungeon
	{
		return "The hero is located in " + theHero.location;
	}
	
	public String toString()//dungeon information
	{
		String message = "Here is the information about the entire dungeon: ";
		for(int rows = 0; rows < this.finalRoom.length;rows++)
		{
			for(int columns = 0; columns < this.finalRoom[columns].length; columns++)
			{
				message += finalRoom[rows][columns];
				//column reaches 5 then new line?
			}
		}
		
		return message;
	}
 	
}//end Dungeon class