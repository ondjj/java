package afternoonJava;

import java.util.Scanner;

public class DemensionArray_03 {

	public static void main(String[] args) {
		/*
		 * Q2) �л� 3���� ����, ����, ���� ������ �Է¹޾� �л��� ������ ���� �հ踦 �Ʒ��� ���� ����ض�. 
		 * ( �迭�� ũ�� 4*4 )
		 * 
		 * <�ܼ�â> 
		 * 1��° �л��� ���� : 95 100 88 
		 * 2��° �л��� ���� : 85 60 93 
		 * 3��° �л��� ���� : 66 99 88
		 * 
		 * 		����	����	����	���� 
		 * 1��	95	100	 88 283 
		 * 2�� 	85 	 60	 93 238 
		 * 3�� 	66	 99	 88 253 
		 * �հ� 246 259 269	774
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
		
		System.out.print("\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if(i != 3) {
			System.out.print(i+1+"��"+"\t");
			}else {
				System.out.print("�հ�"+"\t");
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
