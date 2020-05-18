
public class Dragon extends Monster
{
	public Dragon(Attack specialAttack)
	{
		super("Daunting Dragon", 180, 3, .5, 60, 100, .1, specialAttack);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " Flies up into the air and bashes down on " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack
}
