package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("�Է��ϼ���: ");
			String lineStr = br.readLine();
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.print("�Էµ� ����: " + lineStr);
			System.out.println();
		}
		
		br.close();

	}

}