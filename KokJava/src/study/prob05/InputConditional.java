package study.prob05;

import java.util.Scanner;

public class InputConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ñ�->");
		int hourPay = scanner.nextInt();
		
		System.out.print("�ٹ� �ð�->");
		int hour = scanner.nextInt();
		
		if(hour > 8) {
			System.out.print("�ϱ�-->");
			System.out.println((int)((hour - 8 ) * (hourPay * 1.5)) + (hourPay * 8));
		}else {
			System.out.print("�ϱ�-->");
			System.out.println(hour*hourPay);
		}
		

	}

}
