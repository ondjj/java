package sec02.exam02;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		// ���� ���������� ����
		RemoteControl localvar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �Ŵϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
	};
	//���� ������ ���
	localvar.turnOn();
}
	void method2(RemoteControl rc) {
		rc.turnOff();
	}
}
