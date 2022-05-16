package sec01.exam04;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAL = 1;
	public static int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			super.fly(); // -> Airplane ��ü�� fly() �޼ҵ� ȣ��
		}
	}

}
