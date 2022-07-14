package CharArray;

import java.util.Scanner;

class Main {

	public String StringToWord(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		
		
		String[] s = str.split(" ");
		
		
		// indexOf() : ���� ������ ���� ���� �����ڷ� �ش� ���ڰ��� ��ġ�� �������ش�
		// �Ʒ��� ��� ���⸦ �߰����� �� �ϸ� -1�� �����ϰ� �߰��ϸ� �ش� ��ġ�� �ε��� ��ȣ�� �����Ѵ�.
		while((pos=str.indexOf(' ')) != -1){
			
			//substring(���۰�, �� �� -1) : ���ڿ��� �߶� �� �� ����ϴ� �޼ҵ�
			//���ڿ��� ���� �ε��� 0���� ���� pos������ �߶� tmp�� �����Ѵ�.
			String tmp = str.substring(0, pos);
			
			// tmp���̸� ��ȯ
			int len = tmp.length();
			
			// �ּҰ� ���ϴ� �˰��� ����
			if(len>m) {
				m=len;
				// tmp�� �߶� ���ڿ��� ���ִ�.
				answer=tmp;
			}
			// �̹� ���� ���ڿ��� ���� �ϱ� �� �� str.substring() ��� 
			// ���� ��ġ + 1���� ������ str�� �����Ѵ�.
			str =str.substring(pos+1);
			
		}
		// ������ ���ڿ��� ������ ���� ������ �� �� �� ���� ������
		// ������ ���ڿ� ���̿� max ���� ���� ���� ���ڿ��� �� ũ�ٸ� ���� �������ش�.
		if(str.length()>m) answer=str;
		/*�ּҰ� ���ϴ� �˰��� ���� Ǯ��
		 * for(String x : s) { int len = x.length(); if(len>m) { m=len; answer=x; }
		 */
		return answer;
		
	}

	public static void main(String[] args) {
			Main T = new Main();
			Scanner kbScanner = new Scanner(System.in);
			String str = kbScanner.nextLine();
			System.out.println(T.StringToWord(str));

		}

}

