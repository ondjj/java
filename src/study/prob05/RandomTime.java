package study.prob05;

public class RandomTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random() * (12-8)) + 8;
		
		switch (time) {
		
		case 8 :
			System.out.println("8: \"����մϴ�.\"");
			break;
		case 9 :
			System.out.println("9: \"ȸ�Ǹ� �մϴ�.\"");
			break;
		case 10 :
			System.out.println("10: \"������ ���ϴ�.\"");
			break;
		default :
			System.out.println("�� �� : \"�ܱ��մϴ�.\"");
		}

	}

}
