package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV�� �մϴ�.");
					}
					
					@Override
					public void turnOff() {
						// TODO Auto-generated method stub
						System.out.println("SmartTV�� ���ϴ�.");
						
					}
				});

	}

}
