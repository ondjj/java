package prob.quiz01;

import java.util.Scanner;
import java.util.zip.ZipEntry;

/*1. �ֹε�Ϲ�ȣ�� �Է¹޾� 2000���� �������� ���������� ������ �Ǻ��ϼ���.
��) 120101-3123456 2000��� ������ �����Դϴ�.
 (String Ŭ������ charAt() �޼ҵ带 �̿� )*/

public class BirthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ��� : ");
		String brithNumString = scanner.nextLine();
		
		char mz = brithNumString.charAt(0);
		
		char gender = brithNumString.charAt(7);
		
		if((mz == '0') || (mz == '1') || (mz == '2')) {
			if (gender == '3') {
				System.out.println("����� 2000�� ���� ����� �����Դϴ�.");
			}else if (gender == '4') {
				System.out.println("����� 2000�� ���� ����� �����Դϴ�.");
			}
		}else {
			if (gender == '1') {
				System.out.println("����� 2000�� ���� ����� �����Դϴ�.");
			}else if (gender == '2') {
				System.out.println("����� 2000�� ���� ����� �����Դϴ�.");
			}
		}
	}

}
