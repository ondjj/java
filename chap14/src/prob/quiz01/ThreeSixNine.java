package prob.quiz01;

import java.util.Scanner;

/*1. 100 �̸��� ������ �ϳ� Ű����� �Է¹޾� ������ �����ϱ�
2. �Է� ���� ����ŭ 369 ������ ���
3. ���ڸ� ���� 3, 6, 9 �϶��� ���ڼ����� ���
4. ���ڸ� ���� 5�� ���� �����ǡ��� ���
5. �� ���� ������ ���� ���ڸ� ���

* ���ǹ� (if, switch) �� ���� ������� Ǯ���*/
public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("100 �̸��� ���� �Է� : ");
		int num = scanner.nextInt();
		if (num >= 100) {
			System.out.print("100 �̸��� ������ �Է��ϼ��� : ");
			num = scanner.nextInt();
		}
		
		/*
		 * for(int i=1;i<=num;i++) {
		 * 
		 * if((i%10==3)||(i%10==6)||(i%10==9)) { System.out.println("�ڼ�"); }else
		 * if(i%10==5) { System.out.println("����!"); }else { System.out.println(i); }
		 * 
		 * }
		 */
		
		while(true) {
			++count;
			switch (count % 10) {
			case 3:
				System.out.println("�ڼ�");
				break;

			case 6:
				System.out.println("�ڼ�");
				break;

			case 9:
				System.out.println("�ڼ�");
				break;
			case 5:
				System.out.println("����!");
				break;
			default:
				System.out.println(count);
				break;
			}
			if (num == count) {
				System.out.println();
				break;
			}
		}

	}

}


