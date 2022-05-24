package sec01.exam07;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // user1 스레드 생성
		user1.setCalculator(calculator); // 공유 객체 생성
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		

	}

}
