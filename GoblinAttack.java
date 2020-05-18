
public class GoblinAttack 
{
	 public String name(){
	        return "Steal your Hit Points";
	    }

	    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
	    {
	        double steal = Math.random();
	        
	        int hPoints;

	        hPoints = (int)(Math.random() * (60 - 30 + 1)) + 20;
	        
	        
	        if (steal <= .4)
	        {
	            System.out.println( attacker.name + " steals " + hPoints " hitpoints from " + opponent.getName()
	            + "Which brings the total hitpoints to " + attacker.hitPoints);
	            attacker.addHitPoints(hPoints);
	            opponent.subtractHitPoints(h{oints);
	         
	        }//end surprise
	        else if (steal >= .8)
	        {
	            System.out.println("Uh oh! " + opponent.getName() + " caught you in the act" +
	                    " stopped you from stealing!");
	        }
	        else
	            attacker.attack(opponent);

}
