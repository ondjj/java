package study.prob06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����
		 * 
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է�
		 * 
		 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * 
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * 
		 * ���
		 * 
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		

		while ((str=br.readLine()) != null) {
			
			st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		}
		System.out.print(sb);

	}

}
