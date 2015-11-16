import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
	private int hp;
	private int strength;
   
	public Creature()
	{
       hp = 10;
       strength = 10;
	}
    
	public int DealDmg()
	{
		Random rand = new Random();
		int dmg = rand.nextInt(strength) + 1;
		
		return dmg;
	}
	
	public void SetStats(int h, int s)
	{
    	if(h >= 5) hp = h;
    	if(s >= 5) strength = s;
    	
    	if(h < 5 && h != 0) System.out.println("ERROR: HP can be less than 5!");
    	if(s < 5 && s != 0) System.out.println("ERROR: Strength can be less than 5!");
	}
	
	// Getters
	public int GetHP()
	{
    	return hp;
	}
	public int GetStrength()
	{
    	return strength;
	}
}

