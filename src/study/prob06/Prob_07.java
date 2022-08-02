package study.prob06;

import java.util.Scanner;

public class Prob_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 컨트롤을 위한 불리언 타입 run 변수 선언
		boolean run = true;
		
		// 사용자 입력에 따라 입,출금 등 분기문 진입
		Scanner scanner = new Scanner(System.in);
		
		// 금액 저장을 위한 int 타입 변수 선언
		int balance = 0;

		// 반복문 시작
		while (run) {
			
			// 사용자 선택
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");
			
			// 사용자 선택 번호 저장
			int select = Integer.parseInt(scanner.nextLine());

			// 스위치문을 사용해 사용자 입력에 따라 동작 분리
			switch (select) {
			case 1:
				System.out.print("예금액> ");
				
				// balance 변수에 예금액 추가
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				
				// balance 변수에 출금액 빼기
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				
				// balance 변수에 등록된 잔고 확인
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
				
			
			case 4:
				
				// run 변수를 false로 바꾸고 반복문 종료
				System.out.println("종료");
				run = false;
				break;
			}

			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
