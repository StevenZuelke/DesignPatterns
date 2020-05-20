package Dungeon;

public class GremlinAttack implements Attack {
    public String name(){
        return "Claws On Fire";
    }

    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
    	
    	 
    	 if (Math.random() <= .4)
         {
             int catchFire = (int)(Math.random() * 45) + 100;
             
             System.out.println(attacker.name + " Lit its claws on fire and scratched at " + opponent.name 
             		+ " for " + catchFire  + " damage!");
             opponent.subtractHitPoints(catchFire);
         }
         else
         {
             System.out.println(attacker.name + " failed to set flames to its claws ");
             System.out.println();
         }
    }
}
