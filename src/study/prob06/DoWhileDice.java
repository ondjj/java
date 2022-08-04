package study.prob06;

public class DoWhileDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice;

		do {

			dice = (int) (Math.random() * 6) + 1;
			
			System.out.println(dice);
			
		} while (dice != 6);

		dice = (int) (Math.random() * 6) + 1;
		System.out.println("프로그램 종료");
	
	}

}
