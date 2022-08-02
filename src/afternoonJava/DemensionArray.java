package afternoonJava;

public class DemensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1) * 10 +j;
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+"\t");
			}
			System.out.println();
		}

	}

}
