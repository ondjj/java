package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5); // setGas method call in car
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("go run.");
			myCar.run(); // run method call in car
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
