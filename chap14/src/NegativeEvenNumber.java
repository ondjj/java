import java.util.Scanner;

public class NegativeEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}else if(i%2==0) {
				System.out.print(-1 * i + " ");
			}
		}
		
		scanner.close();
		


	}

}
