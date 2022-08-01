package study.prob02;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 13, 7, 6, 8, 4, 10, 19 };
		
		System.out.println("소수 판별 알고리즘");
		

		for (int i = 0; i == a.length; i++) {
			for (int k = 2; k < a[i]; k++) {
				if (a[i] % k == 0) {
					
					System.out.println("소수가 아님 :"+ a[i]);
				} else{
					System.out.println("소수 : " + a[i]);
				}
			}

		}

	}

}
