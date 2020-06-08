package Dungeon;

import Dungeon.Attack;
import Dungeon.DungeonCharacter;
import Dungeon.Monster;

public class Goblin extends Monster
{
	 public Goblin(Attack specialAttack)
		{
			super("Greedy Goblin", 50, 8, .9, .15,10, 40, 5, 20, specialAttack);

	    }//end constructor

		public void attack(DungeonCharacter opponent)
		{
			System.out.println(name + " attacks from behind with his claws at " +
								opponent.getName() + ":");
			super.attack(opponent);

		}//end override of attack

}
