package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		case 'C':
		case 'c':
			System.out.println("�մ��Դϴ�.");
		default:
			System.out.println("�������Դϴ�.");
		
		}

	}

}
