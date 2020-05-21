package Dungeon;

public class ThiefAttack implements Attack {

    public String name(){
        return "Surprise Attack";
    }

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        double surprise = Math.random();
        if (surprise <= .4)
        {
            System.out.println("Surprise attack was successful!\n" +
                    attacker.name + " gets an additional turn.");
            attacker.attack(opponent);
            attacker.attack(opponent);
        }//end surprise
        else if (surprise >= .9)
        {
            System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
                    " blocked your attack!");
        }
        else
            attacker.attack(opponent);


    }//end surpriseAttack method
}
