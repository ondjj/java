package kukja.homework;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int select = 0;
		String[] id = new String[3];
		String[] pw = new String[3];
		int idcnt = 0;
		int pwcnt = 0;
		boolean run = true;

		System.out.print("[1]회원가입    " + "[2]로그인    " + "[3]종료   >> ");
		while (run) {

			switch (select = in.nextInt()) {
			case 1:
				if (idcnt == 3) {
					
					System.out.println("회원이 가득 찼습니다.");
					
				} else {

					System.out.println("\" ==== 회원가입 ==== \"");
					
					System.out.print("아이디 입력 : ");
					
					id[idcnt++] = in.next();
					
					System.out.print("비밀번호 입력 : ");
					
					pw[pwcnt++] = in.next();
					

				}
				System.out.print("[1]회원가입    " + "[2]로그인    " + "[3]종료   >> ");
				run = true;

				break;
				
			case 2:
				System.out.println("<< 로그인 >>");
				
				System.out.print("로그인 아이디 입력 : ");
				String logid = in.next();
				
				
				System.out.print("로그인 비밀번호 입력 : ");
				String logpw = in.next();
				
				for(int i = 0; i<2; i++) {
					
					if((logid.equals(id[i])) && (logpw.equals(pw[i]))) {
						System.out.println("로그인 성공 !");
						break;
						
					}else {

						System.out.println("로그인 실패.");
						System.out.println("아이디/비밀번호를 확인하세요.");
						break;
					}
				}
				System.out.print("[1]회원가입    " + "[2]로그인    " + "[3]종료   >> ");
				run = true;
				break;
				

			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
				break;

			default:
				System.out.println("값을 잘못 입력하셨습니다.");
				System.out.print("[1]회원가입    " + "[2]로그인    " + "[3]종료   >> ");
				run = true;
				break;
			}
		}

	}

}
