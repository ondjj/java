package study.prob05;

import java.util.Scanner;

public class ConditionalExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� : ");
		int A = scanner.nextInt();

		if (A >= 91) {
			System.out.println("������ 91~100�Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if (A >= 81) {
			System.out.println("������ 81~90�Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if (A >= 71) {
			System.out.println("������ 71~80�Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}else {
			System.out.println("������ 70�����Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
	}

}
