package sec01.exam23;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 박싱
		Integer objInteger = 100;
		System.out.println("value: " + objInteger.intValue());
		
		// 대입 시 자동 언박싱
		int value = objInteger;
		System.out.println("value " + value);
		
		// 연산 시 자동 언박싱
		int result = objInteger + 100;
		System.out.println("result: " + result);

	}

}
