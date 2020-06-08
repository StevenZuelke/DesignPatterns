package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress extends Hero
{

//-----------------------------------------------------------------
    public Sorceress(Attack specialAttack)
	{
		super("Sorceress", 75, 5, .7, 25, 50, .3, specialAttack);


    }//end constructor

//-----------------------------------------------------------------

//-----------------------------------------------------------------
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " casts a spell of fireball at " +
							opponent.getName() + ":");
		super.attack(opponent, true);
	}//end override of attack method

//-----------------------------------------------------------------


}//end class