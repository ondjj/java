package study.prob09;

import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		/*
		 * ■ 정수형 배열 50개를 생성하고 20개의 1~100까지의 랜덤값 입력 작업선택(1: 삽입, 2: 삭제) : 삽입할 위치 : 삽입할 값 :
		 * 삽입한 후에 데이터 출력 삭제 작업도 마찬가지로 작업
		 */

		Scanner in = new Scanner(System.in);

		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1) + 1;
		}

		System.out.print("생성 값 : ");
		for (int i : arr) {
			System.out.print(i + " ");

		}

		System.out.println();

		System.out.print("작업선택(1: 삽입, 2: 삭제) : ");

		int select = in.nextInt();

		System.out.println();

		switch (select) {
		case 1: {

			System.out.print("삽입 위치 : ");

			int insert = in.nextInt();

			System.out.println();

			for (int i = 0; i < arr.length; i++) {
				if (i == insert) {
					for (int j = arr.length - 1; j > i; j--) {
						arr[j] = arr[j - 1];
					}

					System.out.print("삽입 할 값 : ");
					arr[insert] = in.nextInt();
				}
			}

			System.out.print("변환 값 : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		case 2: {

			System.out.print("삭제 위치 : ");

			int delete = in.nextInt();

			System.out.println();
			int temp = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i == delete) {
					// 배열 크기는 고정되어 있기 때문에 크기를 벗어 난 곳에서 가져 올 수 없다.
					// 예를 들어 arr.length -> 20이고 19까지 도는 반복문에서 19+1번째의 배열을 가져 올 수 없기 때문에
					// arr.length에 -1을 더 해 18까지 도는 반복문을 만들면 아래 코드에서는 18+1까지 동작 해 오류가 나지 않는다.
					for (int j = i; j < arr.length-1; j++) {
						arr[j] = arr[j + 1];

					}
					arr[arr.length - 1] = temp;

				}
			}
			System.out.println();

			System.out.print("변환 값 : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		default:
			System.out.print("잘못된 입력입니다.");
			break;
		}
	}

}
