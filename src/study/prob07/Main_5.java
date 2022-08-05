package study.prob07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ����
		 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
		 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		 * 
		 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		 * 
		 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է�
		 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. ��
		 * ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
		 * 
		 * ���
		 * ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
		 */

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] arr = new int[N];
		
		int M = 0;
		
		double sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = in.nextInt();
			M = M > arr[i] ? M:arr[i] ;
			
		}
		for(int i=0; i<arr.length;i++) {
			sum = sum + (((double)arr[i]/M)*100);
		}
		System.out.println((double)sum/N);
		in.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double sum1 = 0;
		int N1 = Integer.parseInt(br.readLine());
		
		int [] arr1 = new int[N];
		
		int M1 = 0;
		
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = Integer.parseInt(br.readLine());
			M = M > arr1[i] ? M:arr1[i];
		}
		
		for(int i=0; i>arr1.length;i++) {
			sum1 = sum1 +((double)arr1[i]/M)*100;
		}
//		bw.write((int) ((double)sum/N));
		System.out.println((double)sum1/N1);
		
		
	}

}
