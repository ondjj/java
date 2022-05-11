package verify.prob03;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("눈1: " + num1 + " 눈2: " + num2 +" 합=" + (num1 + num2));
			if (num1 + num2 == 5) {
			
			System.out.println("두 눈의 합이 5입니다. 프로그램을 종료합니다.");	
			break;
			}
			
			
		}

	}

}
