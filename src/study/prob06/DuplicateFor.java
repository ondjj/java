package study.prob06;

public class DuplicateFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=4;i++) {
			System.out.printf("*****%d´Ü*****\n",i);
			for(int j=1;j<=9;j++) {
				
				System.out.printf("%d %s %d %s %d \n",i,"*",j,"=",i*j);
			}
		}

	}

}
