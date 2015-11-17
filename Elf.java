import java.util.Random;

public class Elf extends Creature
{
	private int percentChance = 10;
	
	public Elf(int hp, int strength)
	{
    	super(hp, strength);
	}
	
	public int DealDmg()
	{
    	Random rand = new Random();
		int dmg = rand.nextInt(GetCurrStrength()) + 1;
		
		if((rand.nextInt(100) + 1) <= percentChance)
		{
			dmg *= 2;
			System.out.println(" Magic Damage!");
		}
		
		return dmg;
	}
}