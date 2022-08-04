package study.quiz01;

import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String[] name = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.print("명단 입력 >>> ");

			name[i] = in.nextLine();
		}

		for (int i = 0; i < n; i++) {

			System.out.print("검색할 이름을 입력 >>> ");
			String search = in.nextLine();

			if (name[i].equals(search)) {
				System.out.printf("%s님은 %d번째 인덱스에 저장되어있습니다. \n", search, i);
				break;
			} else {
				System.out.println("목록에 없는 이름입니다.");
			}
		}
		in.close();
		
		System.out.println("=================================================");
		String[] name1 = {"혼자바","홍길동","이민후","김우영","임수아","박지우"};
		System.out.print("검색할 이름 입력 >> ");
		String a = in.nextLine();
		
		boolean c = true;
		
		for(int i=0; i< name1.length;i++) {
			if(a.equals(name1[i])) {
				System.out.println(a + "님은 "+ i +"번째 인덱스에 저장");
				c = false;
			}
		}
		
		if(c) {
			System.out.println(a +" 님은 저장되어 있지 않습니다.");
		}

	}

}
