package study.prob06;

import java.util.Scanner;

public class FiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum = 0;
		for(int i=1; i<=5;i++) {
			
			System.out.print("�����Է�"+i+">>> ");
			int num = scanner.nextInt();
			
			if(num>0) {
				sum += num;
			}else {
				continue;
			}
		}System.out.println("����� ���� " + sum + "�Դϴ�.");

	}

}
