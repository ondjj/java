package study.prob04;

public class Pallndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12321;
		int tmp = number;

		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����

		while (tmp != 0) {
			
			result = result*10 + tmp % 10;
			tmp /= 10;
			
			System.out.println(tmp);

		}

		if (number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");

	}

}
