package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileSum {

	public static void main(String[] args)throws IOException {
		
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(br.readLine());
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum+=i;
			
			i++;
		}
		System.out.printf("1���� %d������ �� : %d",num,sum);

	}

}
