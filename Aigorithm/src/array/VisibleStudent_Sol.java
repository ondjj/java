package array;

import java.util.Scanner;

class Main {

	public int VisibleStudent_Sol(int n, int[] arr) {
		int answer = 1, max=arr[0];
		for (int i = 1; i < n; i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.print(T.VisibleStudent_Sol(n,arr));

	}

}