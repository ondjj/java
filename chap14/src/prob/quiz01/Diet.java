package prob.quiz01;

import java.util.Scanner;

public class Diet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int weight = scanner.nextInt();
		
		System.out.print("��ǥ ������ : ");
		int taget = scanner.nextInt();
		
		for(;;) {
			
			++count;
			
			System.out.printf("%d���� ���� ������ : ", count);
			
			int weekWeight = scanner.nextInt();
			
			weight = (weight - weekWeight);
			
		
			if(weight <= taget) {
				System.out.println(weight+"Kg ��ǥ �޼�!! ���̾�Ʈ�� �����ϼ̽��ϴ�.");
				break;
			}
		}
		
	}

}
