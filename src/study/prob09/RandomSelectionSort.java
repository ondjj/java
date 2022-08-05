package study.prob09;

public class RandomSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int temp = 0;

		System.out.print("입력 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (50 - 10) + 10) + 1;
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length-1; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}

		}
		System.out.print("변환 값 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
