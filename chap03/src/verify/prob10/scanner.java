package verify.prob10;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° �� :");
		double num1 = Double.parseDouble(scanner.nextLine());
		//String firstValue = scanner.nextLine();
		
		System.out.print("�ι�° ��:");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		//String secondValue = scanner.nextLine();
		
		System.out.println("-------------------");
		
		if(num2 != 0.0) {
			System.out.println("���: " + (num1/num2));
		}else {
			System.out.println("���: ���Ѵ�");
		}

	}

}
