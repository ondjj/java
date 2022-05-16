package sec02.exam03;

public class HankookTire extends Tire{
	// field
	
	// creater1

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire ¼ö¸í : " +
					(maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ÆãÅ© ***");
			return false;
		}
	}
}
