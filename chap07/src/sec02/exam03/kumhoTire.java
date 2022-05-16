package sec02.exam03;

public class kumhoTire extends Tire{
	// field
	
	// creater1
	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire ¼ö¸í: " +
					(maxRotation - accumulatedRotation) + "È¸");
			 return true;
		} else {
			System.out.println("*** " + location + " kumhoTire ÆãÅ© ***");
			return false;
		}
	}

}
