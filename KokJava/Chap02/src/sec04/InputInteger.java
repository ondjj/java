package sec04;

import java.util.Scanner;

public class InputInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수입력: ");
		int insc = scanner.nextInt();
		
		boolean b = (insc % 2 == 0);
		
		System.out.println(b);
		
		
		

	}

}
