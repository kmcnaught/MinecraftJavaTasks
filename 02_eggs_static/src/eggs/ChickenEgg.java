package eggs;

public class ChickenEgg extends Egg {

	public ChickenEgg() {		
		super("Yellow", 2);
	}

	public String toString(){
		return "CHICKEN " + super.toString();
	}
}
