package inflearn.prob01;

import java.io.IOException;
import java.util.Scanner;

public class StringToWord {

	public static void main(String[] args)throws IOException {
		/*
		 * 3. ���� �� �ܾ� ����
		 * 
		 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * ������� �� �ܾ�� �������� ���е˴ϴ�.
		 * 
		 * �Է� 
		 * ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * 
		 * ��� 
		 * ù �ٿ� ���� �� �ܾ ����Ѵ�. 
		 * ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
		 * 
		 * ���� �Է�
		 * it is time to study 
		 * ���� ���
		 * study
		 */
		Scanner in = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int temp = 0;
		
		String str = in.nextLine();
		
		String[] cut = str.split(" ");
		
		for(int i=0; i<cut.length; i++) {
			/*
			 * System.out.print(cut[i].length()); System.out.println();
			 */
			if(max<=cut[i].length()) {
				
				max = cut[i].length();
				++count;
			}
//			System.out.print(cut[i]);
		}
		System.out.println(count);
		System.out.println(cut[count]);
	}

}
