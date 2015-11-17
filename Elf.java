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
    	int dmg = super.DealDmg();
		
		Random rand = new Random();
		if((rand.nextInt(100) + 1) <= percentChance)
		{
			dmg *= 2;
			System.out.println(" Magic Damage!");
		}
		
		return dmg;
	}
}