package study.prob06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int N = scanner.nextInt();
		 * 
		 * for (int i = 1; i <= N; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println();
		 * 
		 * }
		 */

	}

}
