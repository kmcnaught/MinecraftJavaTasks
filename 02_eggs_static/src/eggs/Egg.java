package eggs;

public abstract class Egg {
	
	String colour;   
	int size;
	boolean hatched = false;
	
	static int numberOfUnhatchedEggs = 0;
	
	// Basic constructor, sets properties
	public Egg(String colourString, int size) {
		this.colour = colourString;
		this.size = size;
		
		System.out.println("Instantiated a new "+this.toString());

		// Keep track of all eggs via static variable
		numberOfUnhatchedEggs = numberOfUnhatchedEggs + 1;
	}
	
	public void hatch() {
		System.out.println("Egg hatched!");
		hatched = true;
		numberOfUnhatchedEggs = numberOfUnhatchedEggs - 1;
	}
	
	public String toString() {
		if (hatched) {
			return String.format("egg (%s, %d) [HATCHED]", colour, size);
		}
		else { 
			return String.format("egg (%s, %d)", colour, size);
		}
	}
	
	
}
