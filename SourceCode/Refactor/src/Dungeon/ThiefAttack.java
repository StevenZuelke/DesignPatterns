package Dungeon;

public class ThiefAttack implements Attack {

    public String name(){
        return "Surprise Attack";
    }

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent) {

        double surprise = Math.random();
        Hero hero = (Hero) attacker;

        if (surprise <= .4) {

            System.out.println("Surprise attack was successful!\n" +
                    attacker.name + " gets an additional turn.");
            hero.attack(opponent, true);
            hero.attack(opponent, true);

        }//end surprise

        else if (surprise >= .9) {

            System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
                    " blocked your attack!");

        }//end else if

        else
            hero.attack(opponent, true);
        //end else

    }//end surpriseAttack method

}//end class
