package study.quiz01;

import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String[] name = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.print("��� �Է� >>> ");

			name[i] = in.nextLine();
		}

		for (int i = 0; i < n; i++) {

			System.out.print("�˻��� �̸��� �Է� >>> ");
			String search = in.nextLine();

			if (name[i].equals(search)) {
				System.out.printf("%s���� %d��° �ε����� ����Ǿ��ֽ��ϴ�. \n", search, i);
				break;
			} else {
				System.out.println("��Ͽ� ���� �̸��Դϴ�.");
			}
		}
		in.close();
		
		System.out.println("=================================================");
		String[] name1 = {"ȥ�ڹ�","ȫ�浿","�̹���","��쿵","�Ӽ���","������"};
		System.out.print("�˻��� �̸� �Է� >> ");
		String a = in.nextLine();
		
		boolean c = true;
		
		for(int i=0; i< name1.length;i++) {
			if(a.equals(name1[i])) {
				System.out.println(a + "���� "+ i +"��° �ε����� ����");
				c = false;
			}
		}
		
		if(c) {
			System.out.println(a +" ���� ����Ǿ� ���� �ʽ��ϴ�.");
		}

	}

}
