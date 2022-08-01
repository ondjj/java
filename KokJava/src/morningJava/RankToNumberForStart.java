package morningJava;

public class RankToNumberForStart {

	public static void main(String[] args) {
		/*
		 * 양수 2000부터 음수 2000까지의 랜덤 수 20개를 배열에 저장한 뒤, 배열에 저장된 수 20개의 순위를 출력해보세요 !
		 * 
		 * 랜덤 배열 값 - 배열 순회 - rank 등록 - 배열 순회 - 검증 반복
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
			
			System.out.println((i + 1)+" 번째 값 :"+ number[i] +" 순위 : "+"\t"+"("+a+")등  " + b);
		}

	}

}
