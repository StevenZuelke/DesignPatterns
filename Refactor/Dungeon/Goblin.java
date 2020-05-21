
public class Goblin extends Monster
{
	 public Goblin(Attack specialAttack)
		{
			super("Galdef The Goblin", 80, 8, .9, .3, 10, 15, 30, specialAttack);

	    }//end constructor

		public void attack(DungeonCharacter opponent)
		{
			System.out.println(name + " attacks from behind with his claws at " + opponent.getName() + ":");
			super.attack(opponent);

		}//end override of attack

}
