package study.prob05;

import java.util.Scanner;

public class ConditionalExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 1 입력 :");
		int num1 = scanner.nextInt();
		
		System.out.print("연산 기호 입력:");
		String z = scanner.next();
		
		
		
		System.out.print("정수 2 입력 :");
		int num2 = scanner.nextInt();
		
		
		if(z.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}else if (z.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		}else if (z.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		}else
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));

	}

}
