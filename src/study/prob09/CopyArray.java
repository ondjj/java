package study.prob09;

public class CopyArray {

	public static void main(String[] args) {
		// ������ �迭 10���� 1~31 ���� �������� �Է��ϰ�
		// �� �ٸ� �迭�� �ڿ������� ������ ���� �迭�� ���� �迭�� ����Ͻÿ�.

		int n = 10;
		int min = 1;

		int max = 31;

		int[] numArr = new int[n];

		int[] copyArr = new int[n];

		int cnt = 0;

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * (max - min) + min) + 1;
			System.out.print(numArr[i] + " ");
		}

		System.out.println();

		for (int i = copyArr.length - 1; i >= 0; i--) {

			copyArr[cnt] = numArr[i];
			cnt++;
		}

		for (int i : copyArr) {
			System.out.print(i + " ");
		}

	}

}
