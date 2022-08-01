package study.quiz01;

import java.util.Scanner;

public class Ox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] arr = {2,4,3,5,1};
		
		int[] answer = new int[arr.length];
		System.out.println("채점");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) +" 번 답 >> ");
			answer[i] = in.nextInt();
			
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == answer[i]) {
				System.out.println("O ");
				cnt++;
			}else {
				System.out.println("X ");
			}
		}System.out.println("총 점: "+ cnt * 20 + "점");

	}

}
