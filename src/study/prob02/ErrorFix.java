package study.prob02;

public class ErrorFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float) d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+ result);
		
		System.out.println("int Ÿ���� �ִ밪: " + Integer.MAX_VALUE);
		System.out.println("int Ÿ���� �ּҰ�: " + Integer.MIN_VALUE);
		
		System.out.println("byte �ִ밪: " + Byte.MAX_VALUE);
		System.out.println("byte �ּҰ�: " + Byte.MIN_VALUE);
		
		System.out.println("short �ִ밪: " + Short.MAX_VALUE);
		System.out.println("short �ּҰ�: " + Short.MIN_VALUE);
		
		System.out.println("char �ִ밪: " + (int)Character.MAX_VALUE);
		System.out.println("char �ּҰ�: " + (int   )Character.MIN_VALUE);
		
		System.out.println("long �ִ밪: " + Long.MAX_VALUE);
		System.out.println("long �ּҰ�: " + Long.MIN_VALUE);

	}

}
