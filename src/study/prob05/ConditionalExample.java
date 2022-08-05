package study.prob05;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상품 수량 =>");
		int num = scanner.nextInt();
		
		int gift = 7000;
		
		if(num >= 8) {
			System.out.println("가격은" +(int)((gift * num)*0.9) + "입니다.");
		}else {
			
			System.out.println("가격은" + (gift * num) + "입니다.");
		}
		
		
		

	}

}
