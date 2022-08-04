package morningJava;

public class LeapYear {

	public static void main(String[] args) {
		/*
		 * ������ 1900~2004 ���� 30���� �����մϴ�. �� �߿��� ������ ar �迭�� , ������ �ƴ� ���� br �迭�� ���� �� ar �迭��
		 * br �迭�� ����մϴ�. ( �� 0 ���� ������� �ʽ��ϴ�.) ( ���� for�� ������ )
		 * 
		 * �����̶� ? ������ 4�� ��� �̸鼭 ,100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���Դϴ�.
		 */

		int[] arrRandom = new int[30];
		int[] ar = new int[30];
		int[] br = new int[30];
		int arcnt = 0;
		int brcnt = 0;

		for (int i = 0; i < arrRandom.length; i++) {
			arrRandom[i] = (int) (Math.random() * (2004 - 1900) + 1900) + 1;
			System.out.print(arrRandom[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arrRandom.length; i++) {

			if ((arrRandom[i] % 4 == 0) && (arrRandom[i] % 100 != 0) || (arrRandom[i] % 400 == 0)) {
				ar[arcnt] = arrRandom[i];
				arcnt ++;
			} else {
				br[brcnt] = arrRandom[i];
				brcnt++;
			}
		}
		
		System.out.print("���� : ");
		for (int i : ar) {
			if (i == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("���� �ƴ� : ");
		for (int i : br) {
			if (i == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		
	}

}
