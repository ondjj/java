package study.prob05;

public class TwoDemensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total += arr[i][j];
				
			}
		} 
		average = total / (float)(arr.length * arr[0].length);
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		
		int x = 5;
		System.out.println(x++);
		System.out.print("\n");
		
		System.out.println();

	}

}
