package study.quiz02;

public class DemensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		
		int n = 20;
			
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n = n+5;
				arr[j][i] = n;
			}
			n = 20-i-1;
		}
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		
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
