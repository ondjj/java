package study.prob06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintN {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {

			// ���๮�� \n�� �ʿ��� ���� ->BufferedWriter�� ����� ����ϸ� �� ����� ��� �ϱ� �����̴�.
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		
		

	}

}
