package afternoonJava;

import java.util.Scanner;

public class GroupQuiz {

	public static void main(String[] args) {

		boolean flag = true;
		
		int cnt = 0;

		while (flag) {

			int num = (int) (Math.random() * 101);

			System.out.println(num);

			cnt++;
			if (num == 76) {
				System.out.println(num + "��(��) ��������� ��" + " " + cnt + "�� �����Ͽ����ϴ�");
				flag = false;
			}
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("���� : ");
		int age = in.nextInt();
		
		if(age<20) {
			System.out.println("10���Դϴ�.");
		}else if(age<30) {
			System.out.println("20���Դϴ�.");
		}else {
			System.out.println("30�� �̻��Դϴ�.");
		}
		
		int roop = in.nextInt();
		
		for (int i = 0; i < roop; i++) {
			System.out.println("JAVA ���α׷���");
		}

	}

}
