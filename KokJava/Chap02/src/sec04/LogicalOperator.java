package sec04;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int charCode = 'a';
		System.out.println(charCode);
		
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("�빮���Դϴ�.");
		} else {
			System.out.println("�빮�ڰ� �ƴմϴ�.");
		}

		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ����Դϴ�.");
		}else {
			System.out.println("�ҹ��ڰ� �ƴմϴ�.");
		}
	}

}
