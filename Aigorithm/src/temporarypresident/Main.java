package temporarypresident;

import java.util.Scanner;

public class Main {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		// i : 기준이 되는 학생
		// j : 학년
		for(int i=1; i<= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				for(int k = 1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}



		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n+1][6];

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.print(t.solution(n, arr));

	}

}
