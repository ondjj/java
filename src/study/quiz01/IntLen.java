package study.quiz01;

import java.util.Scanner;

public class IntLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0; 
		int count = 0;
		double result =0 ;
		/* 자리 수 출력
		 * int[] numLen = new int[in.nextInt()];
		 * 
		 * System.out.println(numLen.length);
		 */
		
		/* 랜덤 정수 출력
		 * int[] ranNum = new int[in.nextInt()];
		 * 
		 * for(int i = 0; i<ranNum.length; i++) { ranNum[i] =
		 * (int)(Math.random()*(15-5)+6); System.out.print(ranNum[i]+" "); }
		 */
		
		/* 랜덤 정수 합계
		 * int[] tenNum = new int[in.nextInt()];
		 * 
		 * for(int i = 0; i<tenNum.length; i++) { tenNum[i] =
		 * (int)(Math.random()*(20-2)+3); sum = sum+tenNum[i]; }
		 * System.out.println(sum);
		 */
		
		/* 랜덤 정수 짝수 합, 개수 출력
		 * int[] num = new int[in.nextInt()];
		 * 
		 * for(int i=0; i<num.length; i++) { num[i] = (int)(Math.random()*100)+1;
		 * if(num[i]%2==0) { sum += num[i]; count++; System.out.print(num[i]+" ");
		 * 
		 * } } System.out.println(); System.out.println(sum); System.out.println(count);
		 */
		int[] a = new int[200];
		
		int start = 5;
		int end = 1000;
		int idx=0;
		int j;
		
		for(int i = start; i<= end; i++) {
			for(j = 2; j<i; j++) {
				if(i % j == 0)
					break;
			}
			if(i == j) {
				a[idx] = i;
				idx++;
			}
		}
		System.out.println("***  솟수 출력 ***");
		for(  j=0; j<a.length; j++) {
			System.out.println("a["+j+"] = " + a[j]);
		}
	}
}
