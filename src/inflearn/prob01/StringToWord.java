package inflearn.prob01;

import java.io.IOException;
import java.util.Scanner;

public class StringToWord {

	public static void main(String[] args)throws IOException {
		/*
		 * 3. 문장 속 단어 설명
		 * 
		 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
		 * 
		 * 문장속의 각 단어는 공백으로 구분됩니다.
		 * 
		 * 입력 
		 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
		 * 
		 * 출력 
		 * 첫 줄에 가장 긴 단어를 출력한다. 
		 * 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
		 * 
		 * 예시 입력
		 * it is time to study 
		 * 예시 출력
		 * study
		 */
		Scanner in = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int temp = 0;
		
		String str = in.nextLine();
		
		String[] cut = str.split(" ");
		
		for(int i=0; i<cut.length; i++) {
			/*
			 * System.out.print(cut[i].length()); System.out.println();
			 */
			if(max<=cut[i].length()) {
				
				max = cut[i].length();
				++count;
			}
//			System.out.print(cut[i]);
		}
		System.out.println(count);
		System.out.println(cut[count]);
	}

}
