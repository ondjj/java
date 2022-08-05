package study.quiz01;

public class TenToTwohundred {

	public static void main(String[] args) {
		// ■ 10~200 사이의 랜덤 숫자 10개를 배열에 저장하고
		// 전체 배열요소를 출력하고 50에 가장 가까운 수 출력

		int[] num = new int[10];
		final int FIFTY = 50;
		int min = 200;
		int minvalue = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 191) + 10;

			System.out.print(num[i] + " ");

			int abs = Math.abs(FIFTY - num[i]);
			if (min > abs) {
				minvalue = num[i];
				min = abs;
			}
		}
		System.out.println();
		System.out.println("50에 가장 가까운 값 : " + minvalue);
	}

}
