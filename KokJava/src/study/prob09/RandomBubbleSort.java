package study.prob09;

public class RandomBubbleSort {

	public static void main(String[] args) {
		// �� ������ �迭 10���� 10~50���� ������ �Է��ϰ� �������� ���������� �Է°��� ������ �� ���
		// ���� ���� -> 0,1 1,2,2,3,3,4

		int[] arr = new int[10];
		int temp = 0;

		System.out.print("���� �� : ");
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

		System.out.print("��ȯ �� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
