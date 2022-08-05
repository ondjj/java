package study.prob06;

public class RandomNumber1To6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1; i<=6; i++) {
			
			int num = (int)((Math.random())*45)+1;
			System.out.printf("%d번째 랜덤 정수 : %d \n", i, num);
		}

	}

}
