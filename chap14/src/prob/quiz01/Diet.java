package prob.quiz01;

import java.util.Scanner;

public class Diet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int weight = scanner.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int taget = scanner.nextInt();
		
		for(;;) {
			
			++count;
			
			System.out.printf("%d주차 감량 몸무게 : ", count);
			
			int weekWeight = scanner.nextInt();
			
			weight = (weight - weekWeight);
			
		
			if(weight <= taget) {
				System.out.println(weight+"Kg 목표 달성!! 다이어트를 성공하셨습니다.");
				break;
			}
		}
		
	}

}
