package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); --> vehicle �������̽��� ���ǵǾ���������
		
		Bus bus = (Bus) vehicle; // -> ����Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();

	}

}
