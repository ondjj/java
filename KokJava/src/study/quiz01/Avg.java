package study.quiz01;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sty = {90,87,76,45,78,94,70,81,65,99};
		
		int sum = 0;
		
		for(int i=0; i<sty.length;i++) {
			sum += sty[i];
			
		}System.out.println("학생 평균 점수 : " + (double)(sum/10));

	}

}
