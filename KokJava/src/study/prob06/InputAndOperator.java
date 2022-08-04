package study.prob06;

import java.util.Scanner;

public class InputAndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		scanner.close();
		
		int num1 = a>b ? a : b;
		int num2 = a<b ? a : b;
		
		System.out.printf("%d + %d = %d \n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
		System.out.printf("%d / %d = %d \n",num1,num2,num1/num2);
		System.out.printf("%d * %d = %d \n",num1,num2,num1*num2);
		

	}

}
