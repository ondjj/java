package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int temp;
		for(int i = 1 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print(a[i] + " ");
		}

	}

}
