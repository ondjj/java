package study.prob09;

public class LastNumberSearch {

	public static void main(String[] args) {
		// ������ �迭 30���� 5~15 ������ ������ �Է��ϰ�, ������ 12 �˻��ؼ� ��ġ���

		int[] arr = new int[30];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (15 - 5) + 5) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] == 12) {
				System.out.println("���� 12�� ������ �ε�����" + i + "�Դϴ�.");
				break;
			}else {
				continue;
			}
		}

	}

}
