package study.prob07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ���� 
		 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ���, ���� �ٸ� 9���� �ڿ���
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61
		 * �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		 * 
		 * �Է� 
		 * ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
		 * 
		 * ���
		 * ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
		 */
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int[] val = new int[9]; int leng = 1; int max = 0;
		 * 
		 * for(int i=0; i<val.length;i++) { val[i] = scanner.nextInt();
		 * 
		 * max = val[i] > max ? val[i] : max; }
		 * 
		 * for(int i=0; i<val.length;i++) { if(val[i] == max) { break; }else { ++leng; }
		 * } System.out.println(max); System.out.println(leng);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] val1 = new int[9];
		int leng1 = 1;
		int max1 = 0;
		
		for(int i=0; i<val1.length;i++) {
			val1[i] = Integer.parseInt(br.readLine());
			max1 = val1[i] > max1 ? val1[i] : max1;
		}
		
		for(int i=0; i<val1.length;i++) {
			if(val1[i] == max1) {
				break;
			}++leng1;
		}
		bw.write(max1 + "\n");
		bw.write(leng1 + "\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
