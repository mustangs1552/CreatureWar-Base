import java.util.Random;

public class Demon extends Creature
{
	private int percentChance = 5;
	
	public Demon(int hp, int strength)
	{
    	super(hp, strength);
	}
	
	public int DealDmg()
	{
    	int dmg = super.DealDmg();
		
		Random rand = new Random();
		if((rand.nextInt(100) + 1) <= percentChance)
		{
			dmg += 50;
			System.out.println(" Magic Damage!");
		}
		
		return dmg;
	}
}