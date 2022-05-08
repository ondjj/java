package sec04.prob04;
import java.util.Scanner;

public class verify {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		
		String name = "1. 이름: " + scanner.nextLine();
		String sixnum = "2. 주민번호 앞 6자리: " + scanner.nextLine();
		String tel = "3. 전화번호: " + scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(sixnum);
		System.out.println(tel);
		

	}

}
