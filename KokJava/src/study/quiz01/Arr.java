package study.quiz01;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50,60};
		
		for(int i=0; i<arr1.length;i++) {
			if(i==3) {
				continue;
			}else {
				System.out.print(arr1[i]+ " ");
			}
		
		}
		System.out.println();
		System.out.println("==============================");
		
		int[] arr2 = {10,20,30,40,50,60};
		int temp = 0;
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==30) {
				temp=arr2[i];
				arr2[i] = arr2[4];
			}else if(arr2[i]==50) {
				arr2[i] = temp;
			}
			System.out.print(arr2[i]+" ");

		}
		System.out.println();
		System.out.println("===================================");
		
		int[] arr3 = {75,65,48,71,35,26,94,81};
		
		int max = 0;
		int min = 100;
		
		for(int i=0; i<arr3.length;i++) {
			
			max = max > arr3[i] ? max: arr3[i];
			min = min > arr3[i] ? arr3[i]: min;
			
		}
		System.out.printf("최댓값: %d 최소값: %d \n",max,min);
		System.out.println("====================================");
		
		int[] arr4 = new int[10];
		
		for(int i=0;i<arr4.length+1;i++) {
			arr4[i] = (arr4[i] + 10*i)+10;
			
			System.out.println(arr4[i]);
		}

	}

}
