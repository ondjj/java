package primenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime_Sol {
	public boolean isPrime(int num) {
		
		
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePrime_Sol rs = new ReversePrime_Sol();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		for (int i : rs.solution(n, arr)) {
			System.out.print(i + " ");
		}

	}
}