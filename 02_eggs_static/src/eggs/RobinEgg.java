package eggs;

public class RobinEgg extends Egg {

	public RobinEgg() {		
		super("Speckled red", 1);
	}
	
	public String toString(){
		return "ROBIN " + super.toString();
	}
}
