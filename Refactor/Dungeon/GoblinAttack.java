
public class GoblinAttack 
{
	 public String name(){
	        return "Steal Hit Points";
	    }

	    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
	    {
	        int steal = Math.random();
	        
	        int hPoints;

	        hPoints = (int)(Math.random() * (60 - 30 + 1)) + 20;
	        
	        
	        if (steal <= .4)
	        {
	        	
	            attacker.addHitPoints(hPoints);
	            opponent.subtractHitPoints(hPoints);
	            
	            System.out.println( attacker.name + " sneaks behind and steals " + hPoints " hitpoints from " + opponent.getName()
	            	+ "Which brings its total hitpoints to " + attacker.hitPoints);
	        }
	         
	        }
	        else if (steal >= .8)
	        {
	            System.out.println("Uh oh! " + opponent.getName() + " saw you from a mile away and" +
	                    " stopped you from stealing!");
	        }
	        else
	            attacker.attack(opponent);

}
