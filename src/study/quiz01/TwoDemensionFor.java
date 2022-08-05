package study.quiz01;

import java.util.Scanner;

public class TwoDemensionFor {

	public static void main(String[] args) {
		// TODO 반복문을 사용해 2차원 배열의 값을 입력하시오.

		Scanner in = new Scanner(System.in);

		int x = 1;

		int[][] num = new int[5][5];

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				num[i][j] = x++;
			}
		}

		for (int[] a : num) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		int z = 21;
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[j][i] = z++;
			}
		}

		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}

	}

}
