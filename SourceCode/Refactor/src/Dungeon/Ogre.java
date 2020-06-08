package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster
{

    public Ogre(Attack specialAttack)
	{
		super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50, specialAttack);


    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end Dungeon.Monster class