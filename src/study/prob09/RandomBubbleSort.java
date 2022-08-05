package study.prob09;

public class RandomBubbleSort {

	public static void main(String[] args) {
		// ■ 정수형 배열 10개에 10~50사이 랜덤값 입력하고 오름차순 버블정렬후 입력값과 정렬후 값 출력
		// 버블 정렬 -> 0,1 1,2,2,3,3,4

		int[] arr = new int[10];
		int temp = 0;

		System.out.print("원본 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (50 - 10) + 10) + 1;
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;

				}
			}
		}

		System.out.print("변환 값 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
