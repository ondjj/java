package study.quiz02;

public class DenebsuibArrat_04 {

	public static void main(String[] args) {

		// 0 0 1 0 0 (0,0) (0,1) (0,2) (0,3) (0,4) Ω√¿€ ¿Œµ¶Ω∫ : 2
		// 1
		// 0 2 3 4 0 (1,0) (1,1) (1,2) (1,3) (1,4) Ω√¿€ ¿Œµ¶Ω∫ : 1
		// 2 3 4
		// 5 6 7 8 9 (2,0) (2,1) (2,2) (2,3) (2,4) Ω√¿€ ¿Œµ¶Ω∫ : 0
		// 5 6 7 8 9
		// 0 10 11 12 0 (3,0) (3,1) (3,2) (3,3) (3,4) Ω√¿€ ¿Œµ¶Ω∫ : 1
		// 10 11 12
		// 0 0 13 0 0 (4,0) (4,1) (4,2) (3,3) (4,4) Ω√¿€ ¿Œµ¶Ω∫ : 2
		// 13

		int[][] arr = new int[5][5];

		int num = 1;

		int start = 2;
		int end = 3;

		for (int i = 0; i < arr.length; i++) {

			for (int j = start; j < end; j++) {

				arr[i][j] = num++;

			}
			if(i<2) {
				start--;
				end++ ;
			}else {
				start++;
				end--;
			}

		}
		
	

		for (int[] is : arr) {
			for (int is2 : is) {

				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
	}
}
