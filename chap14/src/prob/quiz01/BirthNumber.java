package prob.quiz01;

import java.util.Scanner;
import java.util.zip.ZipEntry;

/*1. 주민등록번호를 입력받아 2000년대생 이전인지 이후인지와 성별을 판별하세요.
예) 120101-3123456 2000년대 이후의 남자입니다.
 (String 클래스의 charAt() 메소드를 이용 )*/

public class BirthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 주민번호를 입력하세요 : ");
		String brithNumString = scanner.nextLine();
		
		char mz = brithNumString.charAt(0);
		
		char gender = brithNumString.charAt(7);
		
		if((mz == '0') || (mz == '1') || (mz == '2')) {
			if (gender == '3') {
				System.out.println("당신은 2000년 이후 출생한 남자입니다.");
			}else if (gender == '4') {
				System.out.println("당신은 2000년 이후 출생한 여자입니다.");
			}
		}else {
			if (gender == '1') {
				System.out.println("당신은 2000년 이전 출생한 남자입니다.");
			}else if (gender == '2') {
				System.out.println("당신은 2000년 이전 출생한 여자입니다.");
			}
		}
	}

}
