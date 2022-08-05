package study.prob09;

public class CopyArray {

	public static void main(String[] args) {
		// 정수형 배열 10개에 1~31 사이 랜덤값을 입력하고
		// 또 다른 배열에 뒤에서부터 복사해 원본 배열과 복사 배열을 출력하시오.

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
