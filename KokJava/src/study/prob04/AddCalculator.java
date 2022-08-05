package study.prob04;

public class AddCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int totalSum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			totalSum += sum;
		}
		System.out.println("totalSum= " + totalSum);
	}

}
