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
		
		System.out.println("int 타입의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 타입의 최소값: " + Integer.MIN_VALUE);
		
		System.out.println("byte 최대값: " + Byte.MAX_VALUE);
		System.out.println("byte 최소값: " + Byte.MIN_VALUE);
		
		System.out.println("short 최대값: " + Short.MAX_VALUE);
		System.out.println("short 최소값: " + Short.MIN_VALUE);
		
		System.out.println("char 최대값: " + (int)Character.MAX_VALUE);
		System.out.println("char 최소값: " + (int   )Character.MIN_VALUE);
		
		System.out.println("long 최대값: " + Long.MAX_VALUE);
		System.out.println("long 최소값: " + Long.MIN_VALUE);

	}

}
