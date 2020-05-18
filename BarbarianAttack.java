
public class BarbarianAttack implements Attack 
{
    public String name()
    {
        return "Beastly Bash";
    }
    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        if (Math.random() <= .4)
        {
            int blowPoints = (int)(Math.random() * 85) + 100;
            System.out.println(attacker.name + " Bashes the opponent beastfully for " + blowPoints
                    + " damage!");
            opponent.subtractHitPoints(blowPoints);
        }//end blow succeeded
        else
        {
            System.out.println(attacker.name + " failed to beastly bash");
            System.out.println();
        }//blow failed

    }//end crushingBlow method
}
