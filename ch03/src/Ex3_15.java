import java.util.Scanner;;  // ScannerŬ������ ����ϱ� ���� �߰�

class Ex3_15 {
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
			
		}
		System.out.println("------------------");
		
		Scanner scanner1 = new Scanner(System.in);
		char ch1 = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>>");
		
		String input1 = scanner.nextLine();
		ch1 = input1.charAt(0);
		
		if('0' <= ch1 && ch1 <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		if(('a' <= ch1 && ch1 <= 'z') || ('A' <= ch1 && ch1 <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	} // main
}