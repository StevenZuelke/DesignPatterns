package Dungeon;

public class BarbarianAttack implements Attack 
{
    public String name()
    {
        return "Beastly Taunt";
    }
    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        if (Math.random() <= .4)
        {
            int tauntPower = (int)(Math.random() * 100) + 35
            
            System.out.println(attacker.name + " Shouts a loud taunt and raises his HP by " 
            		+ tauntPower + " Hit Points!");
            
            attacker.addHitPoints(tauntPower); 
        }
        else
        {
            System.out.println(attacker.name + " voice cracked and failed to taunt ");
            System.out.println();
        }

    }
}
