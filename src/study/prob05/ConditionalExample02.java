package study.prob05;

import java.util.Scanner;

public class ConditionalExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� :");
		int a = scanner.nextInt();
		
		System.out.print("���� :");
		int b = scanner.nextInt();
		
		System.out.print("���� :");
		int c = scanner.nextInt();
		
		
		if(((a >= 7) && (b >= 7) && (c >= 7))) {
			System.out.println("�հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�!"); 
		}

	}

}
