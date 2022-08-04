package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int[] arr = new int[N];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			
			int value = scanner.nextInt();
			if (value < X) {
				sb.append(value+" ");
			}
		}
		System.out.print(sb);
		
		
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for(int i=0; i<N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 * 
		 * int N = Integer.parseInt(st.nextToken()); int X =
		 * Integer.parseInt(st.nextToken());
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * st = new StringTokenizer(br.readLine(), " ");
		 * 
		 * for (int i = 0; i < N; i++) { int value = Integer.parseInt(st.nextToken());
		 * 
		 * if (value < X) sb.append(value).append(' '); } System.out.println(sb);
		 */
	}

}
