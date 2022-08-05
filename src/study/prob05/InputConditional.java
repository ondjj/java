package study.prob05;

import java.util.Scanner;

public class InputConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시급->");
		int hourPay = scanner.nextInt();
		
		System.out.print("근무 시간->");
		int hour = scanner.nextInt();
		
		if(hour > 8) {
			System.out.print("일급-->");
			System.out.println((int)((hour - 8 ) * (hourPay * 1.5)) + (hourPay * 8));
		}else {
			System.out.print("일급-->");
			System.out.println(hour*hourPay);
		}
		

	}

}
