package sec02.prob02;

public class Anonymous {
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
			// TODO Auto-generated method stub
			
		}
	};
			
	void method1() {
		Vehicle localVar= new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		
		localVar.run();
	}
	
	void method02(Vehicle v) {
		v.run();
	}

}
