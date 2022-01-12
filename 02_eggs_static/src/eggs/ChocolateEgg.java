package eggs;

public class ChocolateEgg extends Egg {

	public ChocolateEgg() {		
		super("Brown", 5);
	}	

	public String toString(){
		return "CHOCOLATE " + super.toString();
	}
	
	@Override
	public void hatch() {
		System.out.println("Chocolate eggs can't hatch, silly!");		
	}
}
