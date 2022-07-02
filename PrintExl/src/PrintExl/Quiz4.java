package PrintExl;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
		
		boolean b;
		
		if(num % 5 == 0) {
			System.out.println("num 은(는) 5의 배수입니다.");
			
		}else {
			System.out.println("num 은(는) 5의 배수가 아닙니다.");
		}

	}

}
