package verify.prob04;

public class OverlaidFor {
	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int sol = (4*x) + (5*y);
				
				if (sol == 60) {
					System.out.println(x + "," + y);
				}
			}
		}
	}

}
