package morningJava;

public class RankToNumberForStart {

	public static void main(String[] args) {
		/*
		 * ��� 2000���� ���� 2000������ ���� �� 20���� �迭�� ������ ��, �迭�� ����� �� 20���� ������ ����غ����� !
		 * 
		 * ���� �迭 �� - �迭 ��ȸ - rank ��� - �迭 ��ȸ - ���� �ݺ�
		 */

		int[] number = new int[20];
		int[] rank = new int[20];
		int[] cnt = new int[20];
		int rtx = 20;
		
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * (4000) + (-2000)) + 1;
		}

		for (int i = 0; i < rank.length; i++) {
			rank[i] = number[i];
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (rank[i] < rank[j]) {
					int temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
			}
			System.out.print(rank[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < rank.length; i++) {

			for (int j = 0; j < cnt.length; j++) {

				if (number[i] == rank[j]) {
					cnt[i] = j;
				}
			}

		}

		for (int i = 0; i < number.length; i++) {
			int a = cnt[i]+1;
			String b = "";
			for (int j = a; j <= number.length; j++) {
				b += "*";
			}
			
			System.out.println((i + 1)+" ��° �� :"+ number[i] +" ���� : "+"\t"+"("+a+")��  " + b);
		}

	}

}
