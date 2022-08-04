package study.prob07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3_Buffered {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String result = ("") + (A * B * C);

		int[] arr = new int[result.length()];
		int[] temp = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result.charAt(i)-'0';
		}

		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (num[j] == arr[i]) {
					temp[j]++;
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
	
			System.out.println(temp[i]);
	

		}

	}
}
