
public class DragonAttack 
{
	public String name()
    {
        return "Breathe Fire";
    }
    public void attack(DungeonCharacter attacker, DungeonCharacter opponent)
    {
        if (Math.random() <= .3)
        {
            int burnPoints = (int)(Math.random() * 85) + 100;
            
            System.out.println(attacker.name + " Breathes fire on the  " + opponent.name 
            		+ " and deals " + burnPoints  + " damage!");
            
            opponent.subtractHitPoints(burnPoints);
        }
        else
        {
            System.out.println(attacker.name + " couldnt cough up a flame.");
            System.out.println();
        }

}
