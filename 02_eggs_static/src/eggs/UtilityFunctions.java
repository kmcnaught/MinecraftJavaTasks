package eggs;

public class UtilityFunctions {

	public static void PrintAllEggs(Egg[] eggs) {
		System.out.println();
		System.out.println("List of all eggs:");
		for (int i=0; i < eggs.length; i++ ) {
			System.out.println(eggs[i]);
		}
		System.out.println();
	}
	
	public static boolean CoinToss() {		
		return (Math.random() > 0.5f);
	}
	
	public static void SayHello() {
		System.out.println("Hello, world!");
		Egg.numberOfUnhatchedEggs = -999;
	}
}
