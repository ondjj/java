package study.prob04;

import java.util.Scanner;

public class MatchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		
		int answer = (int)(Math.random() * 100) + 1;
//		System.out.println(answer);
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ� Ƚ���� ���� ���� ����
		
		// ȭ������ ���� ����� �Է��� �ޱ� ���ؼ� Scanner Ŭ���� ���
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			input = scanner.nextInt();
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}else if(answer < input){
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else {
				System.out.println("������ϴ�.");
				System.out.printf("�õ� Ƚ���� %d���Դϴ�.", count);
				break;
			}
		} while(true);
	

	}

}
