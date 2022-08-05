package sec04;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 클래스 생성하는 방법
		// 클래스타입 변수명 = new 클래스타입(System.in);
		
		
		Scanner scanner = new Scanner(System.in);
	
		
//		String sc = scanner.next();
//		System.out.println(sc);
		
		String inputData = scanner.nextLine();
		
		System.out.println(inputData);
		
		// 여러가지 타입으로 입력 가능
		// 입력하고자 하는 타입 -> next.타입();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1.이름: ");
		String str = sc.nextLine();
		
		System.out.print("2.주미번호 앞 6자리: ");
		String pnum = sc.nextLine();
		
		System.out.print("3.전화번호: ");
		String cellnum = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(str);
		System.out.println(pnum);
		System.out.println(cellnum);
	
	}

}
