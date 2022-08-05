package study.prob05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("java 점수 입력 : ");
		int java = scanner.nextInt();
		
		System.out.print("python 점수 입력 :");
		int python = scanner.nextInt();
		
		System.out.print("database 점수 입력 :");
		int database = scanner.nextInt();
		
		if((java <= 40) || (python <= 40) || (database <= 40)) {
			System.out.println("합계 : " + (java + python + database));
			System.out.println("평균 : " + (double)(java + python + database)/3);
			System.out.println("재시험을 보세요");
		} else {
			System.out.println("합계 : " + (java + python + database));
			System.out.println("평균 : " + (double)(java + python + database)/3);
		}

	}

}
