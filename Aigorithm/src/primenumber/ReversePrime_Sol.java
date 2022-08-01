package primenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime_Sol {

	public boolean isPrime(int num) {

		if (num == 1)
			return false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0)

				return false;
		}

		return true;

	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 0부터 n만큼 반복 arr의 길이는 n이기 때문에 arr.length도 동일
		for (int i = 0; i < n; i++) {
			
			// 값을 반전 시키기 위한 작업
			// 첫 번째 - 임시 변수 tmp에 배열 0~n-1 까지 담는다.
			int tmp = arr[i];
			
			// res는 반전된 값이 담길 장소
			// 정수 62를 기준으로 반전 시켜보자
			int res = 0;
			
			while (tmp > 0) {
				
				int t = tmp % 10; // --> 정수에 10의 나머지를 구하면 1의 자리 수가 구해진다 2번째 반복 6 % 10 = 6
				
				res = res * 10 + t; // 1번째 반복 0*10+2 = 2, 2번째 반복 2*10 + 6 --> 26으로 반전 완료
				
				tmp = tmp / 10; // 몫으로 10의 자리 6을 구함, 6 / 10 --> 0 반복문 종료
				
			}
			// 반전된 값이 소수인지 판별하기 위해 다른 메서드로 이동 (26)
			if (isPrime(res))
				
				answer.add(res);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 정의 클래스 생성
		ReversePrime_Sol rs = new ReversePrime_Sol();
		
		// 스캐너 클래스 생성
		Scanner kb = new Scanner(System.in);
		
		// 몇 개 입력 받을지 선택 가능하게 n변수로 입력 받음
		int n = kb.nextInt();
		
		// n만큼의 길이를 갖는 배열 생성
		int[] arr = new int[n];

		// 배열 값 받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}

		// 사용자 정의 클래스의 매서드 사용 return 값을 받고 출력 할 예정
		for (int i : rs.solution(n, arr)) {
			System.out.print(i + " ");
		}

	}
}	