import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class Ex2_10 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
		
		System.out.println("------------------");
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("�� �ڸ� ������ �ϳ� �Է����ּ���.>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³���:"+input1);
		System.out.printf("num1=%d%n", num1);
	} 
}