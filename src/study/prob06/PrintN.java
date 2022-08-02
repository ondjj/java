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

			// 개행문자 \n이 필요한 이유 ->BufferedWriter를 사용해 출력하면 한 덩어리로 취급 하기 때문이다.
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
		
		

	}

}
