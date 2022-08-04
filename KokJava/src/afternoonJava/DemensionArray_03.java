package afternoonJava;

import java.util.Scanner;

public class DemensionArray_03 {

	public static void main(String[] args) {
		/*
		 * Q2) 학생 3명의 국어, 영어, 수학 점수를 입력받아 학생별 총점과 과목별 합계를 아래와 같이 출력해라. 
		 * ( 배열의 크기 4*4 )
		 * 
		 * <콘솔창> 
		 * 1번째 학생의 점수 : 95 100 88 
		 * 2번째 학생의 점수 : 85 60 93 
		 * 3번째 학생의 점수 : 66 99 88
		 * 
		 * 		국어	영어	수학	총점 
		 * 1번	95	100	 88 283 
		 * 2번 	85 	 60	 93 238 
		 * 3번 	66	 99	 88 253 
		 * 합계 246 259 269	774
		 */
		
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
