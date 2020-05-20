package Dungeon;


public class Dragon extends Monster
{
	public Dragon(Attack specialAttack)
	{
		super("Daltros The Dragon", 180, 1, .3, .2, 55, 90, 30, 60, specialAttack);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " Flies up into the air and bashes down on " + opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack
}
