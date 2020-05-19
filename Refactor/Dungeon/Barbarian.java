
public class Barbarian extends Hero
{

    public Barbarian(Attack specialAttack)
	{

		super("Broly the Barbarian", 190, 2, .6, 45, 80, .2, specialAttack);


    }



	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " spins at high speeds twirling his axe " + opponent.getName() + ":");
		super.attack(opponent);
	}

}
	
}
