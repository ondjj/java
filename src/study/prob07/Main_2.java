package study.prob07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 문제 
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 예를 들어, 서로 다른 9개의 자연수
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61
		 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		 * 
		 * 입력 
		 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		 * 
		 * 출력
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		 */
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int[] val = new int[9]; int leng = 1; int max = 0;
		 * 
		 * for(int i=0; i<val.length;i++) { val[i] = scanner.nextInt();
		 * 
		 * max = val[i] > max ? val[i] : max; }
		 * 
		 * for(int i=0; i<val.length;i++) { if(val[i] == max) { break; }else { ++leng; }
		 * } System.out.println(max); System.out.println(leng);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] val1 = new int[9];
		int leng1 = 1;
		int max1 = 0;
		
		for(int i=0; i<val1.length;i++) {
			val1[i] = Integer.parseInt(br.readLine());
			max1 = val1[i] > max1 ? val1[i] : max1;
		}
		
		for(int i=0; i<val1.length;i++) {
			if(val1[i] == max1) {
				break;
			}++leng1;
		}
		bw.write(max1 + "\n");
		bw.write(leng1 + "\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
