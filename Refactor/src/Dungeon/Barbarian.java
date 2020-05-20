package Dungeon;

import Dungeon.Hero;

public class Barbarian extends Hero
{

    public Barbarian(Attack specialAttack)
	{

		super("Beast the Barbarian", 150, 2, .6, 45, 80, .2, specialAttack);

    }//end constructor



	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " spins at high speeds twirling his axe " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end attack

}//end class
	

