package sec01.exam02;

public class UseUnicodeWriteKorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char jeon = '��';
		char chang = 'â';
		char jun = '��';
		System.out.println("��-----" + (int) jeon);
		System.out.println("â-----" + (int) chang);
		System.out.println("��-----" + (int) jun);
		
		System.out.println("-----------------------");
		
		int a = 65;
		System.out.print((char)(a));
		System.out.print((char)(a+1));
		System.out.print((char)(a+2));
		System.out.println((char)(a+3));
		
		System.out.println("=======================");
		
		char b;
		
		b = '��';
		
		System.out.println((int)b);
		
		b = '��';
		System.out.println((int)b);
		
		b = '��';
		System.out.println((int)b);
		
		b = '��';
		System.out.println((int)b);
	}

}
 