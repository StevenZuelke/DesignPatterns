package Dungeon;

public class OgreAttack implements Attack {

    public String name(){

        return "Poison Club";

    }//end name

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent) {

        if (Math.random() <= .4)
        {

            int poisonJab = (int)(Math.random() * 100) + 25;

            System.out.println(attacker.name + " Dips its club in poison and bashes "
                    + opponent.getName() + " for " + poisonJab + " damage!");
            opponent.subtractHitPoints(poisonJab);

        } else//end if
        {

            System.out.println(attacker.name + "'s poison dried out ");
            System.out.println();

        }//end else

    }//end attack

}//end class
