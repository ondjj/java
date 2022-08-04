package study.prob09;

public class LastNumberSearch {

	public static void main(String[] args) {
		// 정수형 배열 30개에 5~15 사이의 랜덤값 입력하고, 마지막 12 검색해서 위치출력

		int[] arr = new int[30];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (15 - 5) + 5) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] == 12) {
				System.out.println("정수 12의 마지막 인덱스는" + i + "입니다.");
				break;
			}else {
				continue;
			}
		}

	}

}
