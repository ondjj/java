package bigger;

import java.util.Scanner;

class Main {
	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, 1, 0, -1 };

	public int count(int n, int[][] arr) {
		int answer = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				boolean flag = true;

				for (int k = 0; k < 4; k++) {

					int nx = i + dx[k];

					int ny = j + dy[k];

					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {

						flag = false;

						break;
					}
				}
				if (flag)
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
		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		System.out.print(t.count(n, arr));

	}

}
