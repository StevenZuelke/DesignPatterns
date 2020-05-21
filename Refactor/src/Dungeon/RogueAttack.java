package Dungeon;

public class RogueAttack implements Attack {

    public String name(){

        return "Crossbow Multi-Shot";

    }//end name

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent) {

        int arrowDamage = (int) (Math.random() * 100) + 15;
        double arrowAttacks = Math.random();
        if (arrowAttacks <= .2)
        {

            System.out.println(attacker.name + " Shoots multiple arrows from a crossbow and hits "
                    + opponent.getName() + " With three arrows ");
            opponent.subtractHitPoints(arrowDamage * 2);

        }//end if < .2

        else if (arrowAttacks > .2 && arrowAttacks <= .5) {

            System.out.println(attacker.name + " Shoots multiple arrows from a crossbow and hits "
                    + opponent.getName() + " With two arrows ");
            opponent.subtractHitPoints(arrowDamage);

        }//end if between .2 and .5

        else
            System.out.println(attacker.name + " Shoots multiple arrows from a crossbow and missed "
                    + opponent.getName() + " With all of the arrows ");
        //end else

    }//end attack

}//end class

