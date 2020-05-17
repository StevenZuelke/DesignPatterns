package Dungeon;

public class WarriorAttack implements Attack {
    public String name(){
        return "Crushing Blow";
    }
    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        if (Math.random() <= .4)
        {
            int blowPoints = (int)(Math.random() * 76) + 100;
            System.out.println(attacker.name + " lands a CRUSHING BLOW for " + blowPoints
                    + " damage!");
            opponent.subtractHitPoints(blowPoints);
        }//end blow succeeded
        else
        {
            System.out.println(attacker.name + " failed to land a crushing blow");
            System.out.println();
        }//blow failed

    }//end crushingBlow method
}
