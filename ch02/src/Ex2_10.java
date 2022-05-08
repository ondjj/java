import java.util.Scanner;    // Scanner를 사용하기 위해 추가

class Ex2_10 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
		System.out.println("------------------");
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("세 자리 정수를 하나 입력해주세요.>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용:"+input1);
		System.out.printf("num1=%d%n", num1);
	} 
}