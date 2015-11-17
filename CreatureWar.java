public class CreatureWar
{
	public static void main(String[] args)
	{
		boolean isDebug = true;
		if(isDebug)
		{
			System.out.println("Creature:");
			Creature c = new Creature(10, 10);
			System.out.println(" HP: " + c.GetCurrHP());
			System.out.println(" Strength: " + c.GetCurrStrength());
			
			System.out.println("\nHuman:");
			Human h = new Human(30, 18);
			System.out.println(" HP: " + h.GetCurrHP());
			System.out.println(" Strength: " + h.GetCurrStrength());
			
			System.out.println("\nElf (10 attacks):");
			Elf e = new Elf(10, 10);
			for(int i = 0; i < 10; i++) System.out.println(" " + e.DealDmg());
			
			System.out.println("\nCyber Demon (10 attacks):");
			CyberDemon cd = new CyberDemon(10, 10);
			for(int i = 0; i < 10; i++) System.out.println(" " + cd.DealDmg());
			
			System.out.println("\nBalrog:");
			Balrog b = new Balrog(10, 10);
			System.out.println(" Total damage: " + b.DealDmg());
		}
	}
}