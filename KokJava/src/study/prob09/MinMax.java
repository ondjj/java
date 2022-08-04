package study.prob09;

public class MinMax {

	public static void main(String[] args) {
		// ■ 정수형 배열 10개에 5 ~ 200 사이의 랜덤값 입력하고
		//  최대값과 최소값 출력
		
		int[] arr = new int[10];
		int max = 0;
		int min = 201;
		
		
		for(int i=0; i<arr.length; i ++) {
			arr[i] = (int)(Math.random()*(200-5)+6);
			System.out.print(arr[i]+" ");
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println();
		System.out.println("최대 값 : "+max);
		System.out.println("최소 값 : "+min);

	}

}
