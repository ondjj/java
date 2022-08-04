package study.prob04;

import java.util.Scanner;

public class MatchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		
		int answer = (int)(Math.random() * 100) + 1;
//		System.out.println(answer);
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도 횟수를 세기 위한 변수
		
		// 화면으로 부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = scanner.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(answer < input){
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("맞췄습니다.");
				System.out.printf("시도 횟수는 %d번입니다.", count);
				break;
			}
		} while(true);
	

	}

}
