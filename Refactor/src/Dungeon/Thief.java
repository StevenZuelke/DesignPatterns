package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{

    public Thief(Attack specialAttack)
	{

		super("Thief", 75, 6, .8, 20, 40, .5, specialAttack);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " attacks " +
				opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method

}