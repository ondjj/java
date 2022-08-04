package study.quiz02;

public class DemensionArray_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		int val = 41;
		
		/*
		 * for(int i = 0; i<arr.length;i++) { for(int j = 0; j <arr[i].length; j++) {
		 * arr[j][i] = val++; }
		 * 
		 * if(i==0) { val = 41-(1*5); }else { val = 41-((i+1)*5); } }
		 */
		
		
		/*
		 * for(int i = 0; i<arr.length;i++) { for(int j = 0; j <arr[i].length; j++) {
		 * arr[i][j] = val; val = val - 5; } val = 41 + i + 1; }
		 */
		
		int tmp = 21;
		for(int i = 0; i<arr.length;i++) {
			for(int j = arr[i].length-1; j >= 0; j--) {
				arr[i][j] = tmp;
				tmp = tmp + 5;
			}
			tmp =  21 + i + 1;
		}
		
		printArray(arr);
	}		
		private static void printArray(int[][] arr) {
			for (int[] a : arr) {
				for (int b : a) {
					System.out.print(b+"\t");
					
				}
				System.out.println();
				
			}
		

	}

}
