package sec04;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int charCode = 'a';
		System.out.println(charCode);
		
		if((charCode >= 65) && (charCode<=90)) {
			System.out.println("대문자입니다.");
		} else {
			System.out.println("대문자가 아닙니다.");
		}

		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자입니다.");
		}else {
			System.out.println("소문자가 아닙니다.");
		}
	}

}
