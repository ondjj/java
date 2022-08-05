package study.prob09;

public class NumberSearch {

	public static void main(String[] args) {
		// ■ 정수형 배열 30개에 5~15 사이의 랜덤값 입력하고
		// 12 검색해서 위치출력

		int[] arr = new int[30];
		int cnt = 0;
		final int SEARCH = 12;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (15 - 5) + 5) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == SEARCH) {
				System.out.print("정수 " + SEARCH + " 의 인덱스는 " + i + " 입니다." + "\n");
			}

		}

		for (int x : arr) {
			if (x == SEARCH) {
				flag = true;
				break;
			} else {
				cnt++;
			}
		}
		if(flag) {
			System.out.println(SEARCH+" 의 첫번째 index는 " + cnt + "입니다.");
		}else {
			System.out.println(SEARCH+" 값이 존재 하지 않습니다.");
		}

	}

}
