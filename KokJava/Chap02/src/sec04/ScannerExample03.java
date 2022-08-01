package sec04;

import java.util.Scanner;

public class ScannerExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = scanner.nextInt();
		
		boolean b = (num%2) == 0;
		
		System.out.println(b);
		
		

	}

}
