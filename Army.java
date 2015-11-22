import java.util.ArrayList;
import java.util.Random;

public class Army
{
	private ArrayList<Creature> troops = new ArrayList<Creature>();
	private Creature[] preMadeTroops =
	{
		new Human(30, 18),
		new Elf(10, 10),
		new CyberDemon(10, 10),
		new Balrog(10, 10)
	};
	
	public Army(int size)
	{
    	BuildArmy(size);
	}
	
	private void BuildArmy(int size)
	{
    	Random rand = new Random();
    	int num = 0;
    	
    	for(int i = 0; i < size; i++)
    	{
        	num = rand.nextInt(preMadeTroops.length);
        	troops.add(preMadeTroops[num]);
		}
	}
	
	public void DisplayArmy()
	{
    	for(int i = 0; i < troops.size(); i++)
    	{
        	System.out.println("Troop " + (i + 1) + ":");
        	troops.get(i).DisplayStats();
		}
	}
	public void DisplayTroop(int i)
	{
    	troops.get(i).DisplayStats();
	}
	
	public int Attack(int i)
	{
    	return troops.get(i).DealDmg();
	}
	public boolean Defend(int i, int dmg)
	{
    	boolean died = troops.get(i).TakeDmg(dmg);
    	
		//if(died) troops.remove(i);
		return died;
	}
	
	public int GetSize()
	{
    	return troops.size();
	}
}