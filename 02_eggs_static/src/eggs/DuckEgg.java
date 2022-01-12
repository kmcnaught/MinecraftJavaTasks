package eggs;

public class DuckEgg extends Egg {

	public DuckEgg() {		
		super("Light blue", 3);
	}
	
	public String toString(){
		return "DUCK " + super.toString();
	}
}
