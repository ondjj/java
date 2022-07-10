package prob.quiz01;

import java.util.Scanner;

/*1. 100 미만의 정수를 하나 키보드로 입력받아 변수에 저장하기
2. 입력 받은 수만큼 369 게임을 출력
3. 끝자리 수가 3, 6, 9 일때는 “박수”를 출력
4. 끝자리 수가 5일 때는 “으악”를 출력
5. 그 외의 나머지 수는 숫자를 출력

* 조건문 (if, switch) 두 가지 방법으로 풀어보기*/
public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("100 미만의 정수 입력 : ");
		int num = scanner.nextInt();
		if (num >= 100) {
			System.out.print("100 미만의 정수를 입력하세요 : ");
			num = scanner.nextInt();
		}
		
		/*
		 * for(int i=1;i<=num;i++) {
		 * 
		 * if((i%10==3)||(i%10==6)||(i%10==9)) { System.out.println("박수"); }else
		 * if(i%10==5) { System.out.println("으악!"); }else { System.out.println(i); }
		 * 
		 * }
		 */
		
		while(true) {
			++count;
			switch (count % 10) {
			case 3:
				System.out.println("박수");
				break;

			case 6:
				System.out.println("박수");
				break;

			case 9:
				System.out.println("박수");
				break;
			case 5:
				System.out.println("으악!");
				break;
			default:
				System.out.println(count);
				break;
			}
			if (num == count) {
				System.out.println();
				break;
			}
		}

	}

}


