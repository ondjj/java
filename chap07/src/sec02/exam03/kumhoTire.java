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
			System.out.println(location + " KumhoTire ����: " +
					(maxRotation - accumulatedRotation) + "ȸ");
			 return true;
		} else {
			System.out.println("*** " + location + " kumhoTire ��ũ ***");
			return false;
		}
	}

}
