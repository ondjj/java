package sec02.prob02;

public class Anonymous {
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			// TODO Auto-generated method stub
			
		}
	};
			
	void method1() {
		Vehicle localVar= new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run();
	}
	
	void method02(Vehicle v) {
		v.run();
	}

}
