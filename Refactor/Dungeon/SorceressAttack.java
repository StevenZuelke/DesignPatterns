package Dungeon;

public class SorceressAttack implements Attack {
    public String name(){
        return "Increase Hit Points";
    }

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        int hPoints;

        hPoints = (int)(Math.random() * (50 - 25 + 1)) + 25;
        attacker.addHitPoints(hPoints);
        System.out.println(attacker.name + " added [" + hPoints + "] points.\n"
                + "Total hit points remaining are: "
                + attacker.hitPoints);
        System.out.println();

    }//end increaseHitPoints method
}
