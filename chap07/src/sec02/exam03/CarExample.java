package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.fronLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� kumhoTire�� ��ü");
				car.frontRightTire = new kumhoTire("�� ������", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� kumhoTire�� ��ü");
				car.backRightTire = new kumhoTire("�ڿ�����", 17);
				break;
			}
			System.out.println("---------------------------------");
		}

	}

}
