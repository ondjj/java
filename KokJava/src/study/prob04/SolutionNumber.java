package study.prob04;

public class SolutionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((a*x) + (b*y) == 10) {
					System.out.println("x=" + x + "," + "y=" + y);
				}
			}
		}

	}

}
