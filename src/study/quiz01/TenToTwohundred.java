package study.quiz01;

public class TenToTwohundred {

	public static void main(String[] args) {
		// �� 10~200 ������ ���� ���� 10���� �迭�� �����ϰ�
		// ��ü �迭��Ҹ� ����ϰ� 50�� ���� ����� �� ���

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
		System.out.println("50�� ���� ����� �� : " + minvalue);
	}

}
