package study.prob06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			bw.write("Case #" +i+": ");
			bw.write(Integer.parseInt(st.nextToken()));
			bw.write(" + ");
			bw.write(Integer.parseInt(st.nextToken()));
			
//			System.out.printf("Case #%d:",i);  
			bw.write(Integer.parseInt(st.nextToken()) 
					+ Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.flush();
		bw.close();

	}

}
