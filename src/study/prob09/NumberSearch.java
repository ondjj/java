package study.prob09;

public class NumberSearch {

	public static void main(String[] args) {
		// �� ������ �迭 30���� 5~15 ������ ������ �Է��ϰ�
		// 12 �˻��ؼ� ��ġ���

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
				System.out.print("���� " + SEARCH + " �� �ε����� " + i + " �Դϴ�." + "\n");
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
			System.out.println(SEARCH+" �� ù��° index�� " + cnt + "�Դϴ�.");
		}else {
			System.out.println(SEARCH+" ���� ���� ���� �ʽ��ϴ�.");
		}

	}

}
