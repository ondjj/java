package study.prob07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 문제 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * 
		 * 출력 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		 * 
		 * 예제 입력 1 5 20 10 35 30 7 예제 출력 1 7 35
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int N = scanner.nextInt();
		 * 
		 * int[] arr = new int[N];
		 * 
		 * for (int i = 0; i < N; i++) { arr[i] = scanner.nextInt();
		 * 
		 * }
		 * 
		 * scanner.close(); Arrays.sort(arr); System.out.print(arr[0] + " " + arr[N -
		 * 1]);
		 */

	

		// inputStreamReader -> 바이트 타입으로 입력 받음 -> BufferedReader -> 버퍼에 담아 한 번에 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// br.readLine() -> 문자열 타입으로 한 줄씩 읽어 옴 --> Integer.parseInt --> 정수로 변환
		int N = Integer.parseInt(br.readLine());

		// .readLine() -> 문자열 타입으로 한 줄씩 읽어 옴 --> StringTokenizer 문자열을 공백 기준으로 토큰화
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int index = 0;
		int[] arr = new int[N];

		// st.hasMoreTokens() -> while문 조건으로 토큰이 존재하는동안 루프
		while (st.hasMoreTokens()) {
			// 읽어온 토큰을 정수로 변환 후 배열에 저장
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		// 배열을 오름 차순으로 정렬
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);

	}

}
