package Dungeon;

public class SkeletonAttack implements Attack {

    public String name(){

        return "Bone Dance";

    }//end name

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent) {

        int dancePoints;

        dancePoints = (int)(Math.random() * 36) + 20;
        attacker.addHitPoints(dancePoints);
        System.out.println(attacker.name + " danced around with its bones shaking "
                + "to add " + dancePoints + "hit points, to make its Total hit points remaining: "
                + attacker.hitPoints);
        System.out.println();

    }//end attack

}//end class
