package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{

    public Warrior(Attack specialAttack)
	{

		super("Warrior", 125, 4, .8, 35, 60, .2, specialAttack);


    }//end constructor



	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " swings a mighty sword at " +
							opponent.getName() + ":");
		super.attack(opponent, true);
	}//end override of attack method

}//end Hero class