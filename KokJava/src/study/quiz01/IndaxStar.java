package study.quiz01;

public class IndaxStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {3,4,2,5,7};
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i];j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
