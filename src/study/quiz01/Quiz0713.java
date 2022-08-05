package study.quiz01;

import java.util.Scanner;

public class Quiz0713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = 2;

		int[] arr = new int[in.nextInt()];

		for (int i = 1; i < arr.length; i++) {
			num = num * 2;
			arr[i] = num;
			if (arr[0] == 0) {
				arr[0] = 2;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		String[] java = { "ÀÚ", "¹Ù" };
		int N = in.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < java.length; j++) {
				System.out.print(java[j]);
			}
		}

		in.close();

	}

}
