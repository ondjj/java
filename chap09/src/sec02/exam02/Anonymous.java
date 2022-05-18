package sec02.exam02;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localvar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 컵니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
	};
	//로컬 변수로 사용
	localvar.turnOn();
}
	void method2(RemoteControl rc) {
		rc.turnOff();
	}
}
