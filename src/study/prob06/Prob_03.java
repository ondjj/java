package study.prob06;

public class Prob_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int num1 = 0;
		
		while(num + num1 != 5) {
	
			num = (int)(Math.random()*6)+1;
			num1 = (int)(Math.random()*6)+1;
			
			System.out.printf("%s%d,%d%s \n","(",num,num1,")");
		}

	}

}
