public class CreatureWar
{
	public static void main(String[] args)
	{
		int size = 20;
		Army army1 = new Army(size);
		Army army2 = new Army(size);
		
		System.out.println("=== Armies ====================================");
		System.out.println("Army 1:");
		army1.DisplayArmy();
		System.out.println();
		System.out.println("Army 2:");
		army2.DisplayArmy();
		System.out.println();
		
		System.out.println("=== Combat ====================================");
		boolean finished = false;
		int army1I = 0;
		int army2I = 0;
		while(!finished)
		{
			// Army 1 attacks
			System.out.println("\nArmy 1 attacks!" + army1I);
        	int dmg = army1.Attack(army1I);
        	army1.DisplayTroop(army1I);
        	System.out.println("  dealt " + dmg + " damage!");
        	boolean died = army2.Defend(army2I, dmg);
        	// Check Result
			if(died)
			{
				army2I++;
				System.out.println("Army 2's creature died!");
			}
			if(army2I >= size)
			{
				finished = true;
				System.out.println("\nArmy 1 destroyed Army 2!");
				break;
			}
        	
			// Army 2 attacks
			System.out.println("\nArmy 2 attacks!" + army2I);
			dmg = army2.Attack(army2I);
        	army2.DisplayTroop(army2I);
        	System.out.println("  dealt " + dmg + " damage!");
        	died = army1.Defend(army1I, dmg);
        	// Check Result
			if(died)
			{
				army1I++;
				System.out.println("Army 1's creature died!");
			}
			if(army1I >= size)
			{
				finished = true;
				System.out.println("\nArmy 2 destroyed Army 1!");
				break;
			}
		}
	}
}