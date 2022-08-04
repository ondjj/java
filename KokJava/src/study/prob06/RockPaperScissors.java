package study.prob06;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.가위 || 2.바위 || 3.보");
		System.out.print(">>> 선택 : ");

		String uc;
		boolean run = true;
		
		int win = 0;
		int count = 0;

		do {
			int rps = scanner.nextInt();;
			if((rps != 1) && (rps != 2) && (rps != 3)) {
				 System.out.println("룰을 지켜주세요!");
				 System.out.println("1.가위 || 2.바위 || 3.보");
				 System.out.print(">>> 선택 : ");
				 rps = scanner.nextInt();
			}
			
			int mcRps = (int) (Math.random() * 3) + 1;

			if (rps == mcRps) {
				System.out.println("무승부입니다.");
			} else if ((rps == 1) && (mcRps == 2)) {
				System.out.println(">>> 유저 -> '가위' 컴퓨터 -> '바위' 컴퓨터가 이겼습니다.");
			} else if ((rps == 3) && (mcRps == 1)) {
				System.out.println(">>> 유저 -> '보' 컴퓨터 -> '가위' 컴퓨터가 이겼습니다.");
			} else if ((rps == 2) && (mcRps == 3)) {
				System.out.println(">>> 유저 -> '바위' 컴퓨터 -> '보' 컴퓨터가 이겼습니다.");
			} else if ((rps == 2) && (mcRps == 1)) {
				System.out.println(">>> 유저 -> '바위' 컴퓨터 -> '가위' 유저가 이겼습니다.");
				++win;
			} else if ((rps == 1) && (mcRps == 3)) {
				System.out.println(">>> 유저 -> '가위' 컴퓨터 -> '보' 유저가 이겼습니다.");
				++win;
			} else if ((rps == 3) && (mcRps == 2)) {
				System.out.println(">>> 유저 -> '보' 컴퓨터 -> '바위' 유저가 이겼습니다.");
				++win;

			} else if ((rps != 1) && (rps != 2) && (rps != 3)) {

				System.out.println("게임을 계속하시겠습니까? (Y/N)");
				uc = scanner.next();
				char ch = uc.charAt(0);

				if ((ch == 'n' || ch == 'N')) {
					System.out.println("게임을 종료합니다.");
					run = false;
				} else {
					System.out.println("=== 게임을 다시 시작합니다. ===");
					System.out.println("1.가위 || 2.바위 || 3.보");
					System.out.print(">>> 선택 : ");
					rps = scanner.nextInt();
				}
			} else {
				System.out.println("룰을 지켜주세요!");
				System.out.println("=== 게임을 다시 시작합니다. ===");
				rps = scanner.nextInt();
				if((rps != 1) && (rps != 2) && (rps != 3)) {
					System.out.println("1.가위 || 2.바위 || 3.보");
					System.out.print(">>> 선택 : ");
					 rps = scanner.nextInt();
				}
			}
			++count;
			System.out.println(count);
			System.out.println(win);
		} while (run);
		System.out.printf("유저 승률 : %3.1f%s \n", (((double)win/count)*1000)/(double)10,"%");
	}
}
