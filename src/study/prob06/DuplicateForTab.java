package study.prob06;

public class DuplicateForTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 9; i++) {
			//System.out.printf("*****%d´Ü*****\n", i);
			System.out.println();
			for (int j = 2; j <= 9; j++) {

//				System.out.printf("%d %s %d %s %d \t", j, "*", i, "=", j * i);
				System.out.printf("%d * %d = %d \t", j, i, j * i);

			}

		}

	}
}