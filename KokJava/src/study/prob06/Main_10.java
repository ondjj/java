package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10 {

	public static void main(String[] args) throws IOException {
		
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
		 * �Է��� ���������� 0 �� ���� ���´�.
		 * 
		 * ��� 
		 * 
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */
		// ���1. Scanner Ȱ�� Ǯ��
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * for(;;) { int A = scanner.nextInt();
		 * 
		 * int B = scanner.nextInt();
		 * 
		 * if((A==0) && (B==0)) { break;
		 * 
		 * }else { System.out.println(A+B); } }
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(;;) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B == 0){
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
		br.close();
//		bw.flush();
//		bw.close();

	}

}
