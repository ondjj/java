package study.quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] arr = {1,2,3,4,5,6,7};
		 * 
		 * // �⺻���� �迭 ��� ��� for(int i=0; i<arr.length;i++) {
		 * System.out.print(arr[i]+" "); } System.out.println();
		 * 
		 * // ���� for each for(int x : arr) { System.out.print(x + " "); }
		 * System.out.println();
		 * 
		 * // Arrays.toString Ȱ�� System.out.print(Arrays.toString(arr));
		 */

		Scanner in = new Scanner(System.in);
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		// �� ���� �迭 ��� -> �Ϲ����� ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		} // For-each ���
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}

		System.out.print(Arrays.deepToString(arr));

	}

}
