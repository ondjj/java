package study.prob05;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ǰ ���� =>");
		int num = scanner.nextInt();
		
		int gift = 7000;
		
		if(num >= 8) {
			System.out.println("������" +(int)((gift * num)*0.9) + "�Դϴ�.");
		}else {
			
			System.out.println("������" + (gift * num) + "�Դϴ�.");
		}
		
		
		

	}

}
