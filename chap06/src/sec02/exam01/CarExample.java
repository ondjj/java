package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�ְ� �ӵ�: " + myCar.maxSpeed);
		System.out.println("���� �ӵ�: " + myCar.speed);
		
		//�ʵ� �� ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);

	}

}
