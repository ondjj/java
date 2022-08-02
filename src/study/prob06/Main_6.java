package study.prob06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i + ": ");
			bw.write(A + " + " + B + " = ");
			
			bw.write((A+B) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
