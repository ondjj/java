package afternoonJava;

public class DemensionArray_02 {

	public static void main(String[] args) {
		/*
		 * Q1) 3�� 3���� �迭 �ΰ��� �����ϰ� �Ʒ��� ���� ���� ����. 
		 * �� �迭�� ���� ���Ͽ� �ٸ� �迭�� ���� �� �� �迭�� ����ض�.
		 * 
		 * 
		 * <�ܼ�â> 
		 * ù��° �迭 �� 		�ι�° �迭
		 *  1 2 3 			9 6 3  
		 * 	4 5 6			8 5 2 
		 * 	7 8 9			7 4 1
		 * �ι�° �迭 �� 
		 * 
		 * �� �迭�� �� 
		 * 10 8 6 
		 * 12 10 8 
		   4 12 10
		 */
		
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] arr3 = new int[3][3];
		
		
		
		int num = 1;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num++;
			}
		}
		System.out.println("ù��° �迭 >");
		printArray(arr1);
		
		num = 9;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[j][i] = num--;
			}
		}
		System.out.println("�ι�° �迭 >");
		printArray(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("�� �迭�� �� >");
		printArray(arr3);
	}
	

	private static void printArray(int[][] arr1) {
		for (int[] is : arr1) {
			for (int is2 : is) {
				System.out.print(is2+ "\t");
			}
			System.out.println();
		}
	}

}
