package study.prob05;

import java.util.Scanner;

public class ConditionalExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 1 �Է� :");
		int num1 = scanner.nextInt();
		
		System.out.print("���� ��ȣ �Է�:");
		String z = scanner.next();
		
		
		
		System.out.print("���� 2 �Է� :");
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
