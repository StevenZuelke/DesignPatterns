package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

    public Gremlin(Attack specialAttack)
	{
		super("Gnarltooth the Gremlin", 70, 5, .8, .4, 20, 40, 20, 40, specialAttack);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " + opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Gremlin