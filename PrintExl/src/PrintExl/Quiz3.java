package PrintExl;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = scanner.nextInt();
		
		int a = num - (num % 10) + 1;
		
		System.out.print("���: ");
		System.out.println(a);

	}

}
