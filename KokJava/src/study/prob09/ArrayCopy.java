package study.prob09;

public class ArrayCopy {

	public static void main(String[] args) {
		//정수형 배열 10개에 1~31 사이 랜덤값 입력하고 또 다른 배열에 뒤에서 부터 복사해서 원본배열과 복사한 배열 출력
		
		int[] arr = new int[10];
		
		System.out.print("원본 배열 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(31-1)+1)+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("복사 배열 : ");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
