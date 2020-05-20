package Dungeon;

public class OgreAttack implements Attack {
    public String name(){
        return "Poison Club";
    }

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
    	if (Math.random() <= .4)
        {
            int poisonJab = (int)(Math.random() * 100) + (25 + 20)
            
            System.out.println(attacker.name + " Dips its club in poison and bashes " 
            		+ opponent.getName() + " for " + poisonJab + " damage!");
            
            attacker.addHitPoints(tauntPower); 
        }
        else
        {
            System.out.println(attacker.name + "'s poison dried out ");
            System.out.println();
        }
    }
}
