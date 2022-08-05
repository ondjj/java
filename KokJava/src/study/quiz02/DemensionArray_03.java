package study.quiz02;

public class DemensionArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for(int j = 0; j< arr.length; j ++) {
					arr[i][j] = num++;
				}
			}else {
				for (int j = arr.length-1; j >= 0 ;  j--) {
					arr[i][j] = num++;
				}
			}
			
		}

	}

}
