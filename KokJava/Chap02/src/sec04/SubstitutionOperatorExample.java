package sec04;

import java.util.Scanner;

public class SubstitutionOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int insc = scanner.nextInt();
		
		System.out.println((insc > 0 ? "양수입니다." : (insc < 0 ? "음수입니다." : "0입니다.")));
		
		

	}

}
