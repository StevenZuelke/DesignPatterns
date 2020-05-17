package Dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Rogue extends Hero
{

    public Rogue(Attack specialAttack)
	{

		super("Rogue", 100, 5, .8, 20, 60, .3, specialAttack);


    }//end constructor



	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " uses guerrilla warfare against " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method




}//end Hero class