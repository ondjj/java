package sec01.exam02;

public class UseUnicodeWriteKorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char jeon = '전';
		char chang = '창';
		char jun = '준';
		System.out.println("전-----" + (int) jeon);
		System.out.println("창-----" + (int) chang);
		System.out.println("준-----" + (int) jun);
		
		System.out.println("-----------------------");
		
		int a = 65;
		System.out.print((char)(a));
		System.out.print((char)(a+1));
		System.out.print((char)(a+2));
		System.out.println((char)(a+3));
		
		System.out.println("=======================");
		
		char b;
		
		b = '가';
		
		System.out.println((int)b);
		
		b = '나';
		System.out.println((int)b);
		
		b = '다';
		System.out.println((int)b);
		
		b = '라';
		System.out.println((int)b);
	}

}
 