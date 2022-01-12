package eggs;

public class Program {

	public static void main(String[] args) {
		
		// We start with zero eggs in existence
		
		System.out.println();
		System.out.printf("There are currently %d unhatched eggs in the universe\n", Egg.numberOfUnhatchedEggs);
		System.out.println();		
		
		// Let's create some eggs! 
		
		final int num_eggs = 5;
				
		Egg[] eggs = new Egg[num_eggs];				
		eggs[0] = new DuckEgg();
		eggs[1] = new DuckEgg();
		eggs[2] = new ChickenEgg();
		eggs[3] = new ChocolateEgg();
		eggs[4] = new RobinEgg();			
		
		System.out.println();
		
		// Print all of them out to the console to check what we have
		UtilityFunctions.PrintAllEggs(eggs);
		
		System.out.println("Waiting for some eggs to hatch...");
		
		// We will toss a coin and decide whether each egg is ready to hatch 
		for (int i = 0; i < num_eggs; i++) {
			if (UtilityFunctions.CoinToss()) {
				System.out.printf("Hatching egg number %d\n", i);
				eggs[i].hatch();
			}
		}
		
		// Print all of them out to the console again - some have (probably) hatched
		UtilityFunctions.PrintAllEggs(eggs); 
				
		// Query the number of intact eggs with static access
		System.out.printf("There are currently %d unhatched eggs in the universe\n", Egg.numberOfUnhatchedEggs);
		
		// Query the number of intact eggs via a class instance (allowed but Eclipse gives warning)
		System.out.printf("There are currently %d unhatched eggs in the universe\n", eggs[0].numberOfUnhatchedEggs);
				
		/* // Uncomment me later 		
		UtilityFunctions.SayHello();
		System.out.printf("There are currently %d intact eggs in the universe\n", eggs[0].numberOfUnhatchedEggs);
		*/
	}
	

}
