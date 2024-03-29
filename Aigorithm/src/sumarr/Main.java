package sumarr;

import java.util.ArrayList;
import java.util.Scanner;

// two pointers algorithm
public class Main {

	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		
		while(p1 < n && p2 < m) {
			if(a[p1] < b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		while(p1<n) {
			answer.add(a[p1++]);
		}
		
		while(p2<m) {
			answer.add(b[p2++]);
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}

		for (int i : t.solution(n, m, a, b)) {
			System.out.print(i + " ");
		}
	}

}
