import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (Matthew George) 
 * @version (11/16/15)
 */
public class Creature
{
	private int minHP = 5;
	private int minStrength = 5;
	private int maxHP = 0;
	private int maxStrength = 0;
	private int currHP = 0;
	private int currStrength = 0;
   
	public Creature(int hp, int strength)
	{
       SetStats(hp, strength);
	}
    
	public int DealDmg()
	{
		Random rand = new Random();
		int dmg = rand.nextInt(currStrength) + 1;
		
		return dmg;
	}
	
	private void SetStats(int hpMax, int sMax)
	{
		 // Reset max variables
		// 0 for a param means use default value which is already set
		if(hpMax != 0) maxHP = 0;
		if(sMax != 0) maxStrength = 0;
		
		// Make sure max values are not less than min
    	if(hpMax < minHP && hpMax != 0)
		{
			System.out.println("ERROR: HP can not be less than 5!");
			return;
		}
    	if(maxStrength < minStrength && maxStrength != 0)
		{
			System.out.println("ERROR: Strength can not be less than 5!");
			return;
		}
		
		// Set max values
		Random rand = new Random();
    	if(hpMax >= minHP)
		{
			// Find a new random max until it is not less than min
			while (maxHP < minHP)
			{
				maxHP = rand.nextInt(hpMax) + 1;
				//System.out.println(maxHP);
			}
		}
    	if(sMax >= minStrength)
		{
			// Find a new random max until it is not less than min
			while (maxStrength < minStrength)
			{
				maxStrength = rand.nextInt(sMax) + 1;
				//System.out.println(maxStrength);
			}
		}
		
		// Set the current stats to full/max stats
		currHP = maxHP;
       	currStrength = maxStrength;
	}
	
	// Getters
	public int GetMinHP()
	{
    	return minHP;
	}
	public int GetMinStrength()
	{
    	return minStrength;
	}
	public int GetMaxHP()
	{
    	return maxHP;
	}
	public int GetMaxStrength()
	{
    	return maxStrength;
	}
	public int GetCurrHP()
	{
    	return currHP;
	}
	public int GetCurrStrength()
	{
    	return currStrength;
	}
}

