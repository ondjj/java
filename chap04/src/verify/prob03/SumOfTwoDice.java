package verify.prob03;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("��1: " + num1 + " ��2: " + num2 +" ��=" + (num1 + num2));
			if (num1 + num2 == 5) {
			
			System.out.println("�� ���� ���� 5�Դϴ�. ���α׷��� �����մϴ�.");	
			break;
			}
			
			
		}

	}

}
