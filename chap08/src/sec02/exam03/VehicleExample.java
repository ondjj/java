package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); --> vehicle 인터페이스에 정의되어있지않음
		
		Bus bus = (Bus) vehicle; // -> 강제타입 변환
		
		bus.run();
		bus.checkFare();

	}

}
