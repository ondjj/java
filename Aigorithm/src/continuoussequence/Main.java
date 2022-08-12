package continuoussequence;

import java.util.Scanner;

public class Main {

	int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for (int rt = 0; rt < arr.length; rt++) {
			sum += arr[rt];
			if(sum==m) {
				answer++;
			}
			while (sum >= m) {
				sum -= arr[lt];
				lt++;
				if (sum == m)
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main t = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.print(t.solution(n, m, arr));

	}

}
