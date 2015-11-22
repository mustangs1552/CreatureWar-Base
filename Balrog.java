public class Balrog extends Demon
{
	public Balrog(int hp, int strength)
	{
    	super("Balrog", hp, strength);
	}
	
	public int DealDmg()
	{
    	int dmg1 = super.DealDmg();
    	System.out.println(" Attack 1: " + dmg1);
    	
    	int dmg2 = super.DealDmg();
    	System.out.println(" Attack 2: " + dmg2);
    	
    	return dmg1 + dmg2;
	}
}