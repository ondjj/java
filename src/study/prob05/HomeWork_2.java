package study.prob05;

import java.util.Scanner;

public class HomeWork_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
	

		System.out.print("�� �Է� : ");
		int totalSecond = scanner.nextInt();
		int hour;
		int min = 60;
		int second;

		if ((totalSecond / min) > 60) {
			hour = (totalSecond / min) / 60;
			min = (totalSecond / min) % 60;
			second = ((totalSecond % 60) % 60);
			System.out.printf("%d�� %d�� %d��", hour, min, second);
		}

	}

}
