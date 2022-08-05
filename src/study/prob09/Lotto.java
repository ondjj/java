package study.prob09;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[45];
		int[] result = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<result.length; i++) {
			result[i] = lotto[(int)(Math.random()*44)+1];
			System.out.print(result[i]+" ");
		}
		

	}

}
