package study.prob07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main_4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 문제 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는
		 * 1, 2, 0, 2이다. 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는
		 * 프로그램을 작성하시오. 입력 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이
		 * 아닌 정수이다.
		 * 
		 * 출력 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		 */

		/*
		 * HashSet을 이용한 풀이 HashSet은 Set 인터페이스에서 지원하는 구현 클래스로 순서대로 입력되지않고, 일정하게 유지되지 않는게
		 * 특징이다. null 요소도 허용하지만 가장 큰 특징은 중복을 허용하지않는다.
		 * 
		 * HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시
		 * 코드와 비교한 뒤 같은 해시 코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복
		 * 저장을 하지 않는다.
		 * 
		 * HashSet 변수 선언 HashSet의 변수를 선언하는 방법입니다 HashSet<데이터타입> 변수명 = new
		 * HashSet<데이터타입>(); 으로 선언해줍니다 HashSet<Integer> : Integer형의 HashMap 데이터가 들어갑니다
		 * HashSet<String> : String형의 HashMap 데이터가 들어갑니다
		 * 값 추가는 add 메소드를 통해 추가한다.
		 * 
		 */
		
		// 스캐너 사용
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			h.add(scanner.nextInt() % 42);
		}

		scanner.close();
		System.out.print(h.size());
		
		// 버퍼 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.print(h.size());
		
		
		// 불리언&배열 사용
		boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
		
		

	}

}
