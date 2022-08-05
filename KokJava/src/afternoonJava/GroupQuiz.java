package afternoonJava;

import java.util.Scanner;

public class GroupQuiz {

	public static void main(String[] args) {

		boolean flag = true;
		
		int cnt = 0;

		while (flag) {

			int num = (int) (Math.random() * 101);

			System.out.println(num);

			cnt++;
			if (num == 76) {
				System.out.println(num + "이(가) 나오기까지 총" + " " + cnt + "번 실행하였습니다");
				flag = false;
			}
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = in.nextInt();
		
		if(age<20) {
			System.out.println("10대입니다.");
		}else if(age<30) {
			System.out.println("20대입니다.");
		}else {
			System.out.println("30대 이상입니다.");
		}
		
		int roop = in.nextInt();
		
		for (int i = 0; i < roop; i++) {
			System.out.println("JAVA 프로그래밍");
		}

	}

}
