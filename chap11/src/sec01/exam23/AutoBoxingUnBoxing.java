package sec01.exam23;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڵ� �ڽ�
		Integer objInteger = 100;
		System.out.println("value: " + objInteger.intValue());
		
		// ���� �� �ڵ� ��ڽ�
		int value = objInteger;
		System.out.println("value " + value);
		
		// ���� �� �ڵ� ��ڽ�
		int result = objInteger + 100;
		System.out.println("result: " + result);

	}

}
