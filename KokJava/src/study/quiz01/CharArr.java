package study.quiz01;

public class CharArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 65;
		char[] az = new char[26];

		for (int i = 0; i < az.length; i++) {
			az[i] = (char) num;
			num++;
			System.out.print(az[i] + " ");
		}
		System.out.println();
		for (int i = 25; i >= 0; i--) {
			System.out.print(az[i] + " ");
		}

	}

}
