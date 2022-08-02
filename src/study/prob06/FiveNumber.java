package study.prob06;

import java.util.Scanner;

public class FiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		for(int i=1; i<=5;i++) {
			
			System.out.print("정수입력"+i+">>> ");
			int num = scanner.nextInt();
			
			if(num>0) {
				sum += num;
			}else {
				continue;
			}
		}System.out.println("양수의 합은 " + sum + "입니다.");

	}

}
