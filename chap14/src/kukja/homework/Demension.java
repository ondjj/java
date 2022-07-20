package kukja.homework;

import java.util.Scanner;

public class Demension {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arr[][] = new int[4][4];
		int sum = 0;
		int score = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i <= 2) {
				for (int j = 0; j < arr.length; j++) {
					if (j != 3) {

						score = in.nextInt();

						arr[i][j] = score;

						sum += arr[i][j];

					} else {
						arr[i][j] = sum;
					}

				}
				sum=0;

			}

		}
		
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
				if (j==3) {
					arr[j][i] = sum;
				}
			}
			sum = 0;
		}
		
		System.out.print("\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if(i != 3) {
			System.out.print(i+1+"번"+"\t");
			}else {
				System.out.print("합계"+"\t");
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
