package study.prob06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * InputStreamReader(InputStream in) --> byte stream�� character stream���� �������ִ�
		 * ���� InputStream ��ü�� ������ ���� Ű���� �Է� Ȥ�� ���� ������ ���� �� �ִ�. 
		 * ���� ���� ���� ���¸� ���� ���·� �������ִ� ������ �Ѵ�.
		 */
		
		/*
		 * BufferedReader(Reader in, int sz) --> ȿ�������� ���ڸ� �б����� ���۸��� ����Ѵ�. 
		 * int sz�� ���� ���� ����� ���� �� �� �� �ִ�. 
		 * ���� FileReader, InpurStreamReader�� read()�� ���� cost�� ���� ��� Reader�� �Ķ���ͷ� ���� �޾� ����Ѵ�. 
		 * BufferedReader�� ����ϸ� �ý����� ���۰� ����������� IO�� ������ �����͸�
		 * �о���� ������ ��쿡�� �޸𸮿� �ִ� ���� �����͸� �о� ó���Ѵ� (�ý��ۿ��� IO�� �ڿ� �Ҹ� ũ��)
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * BufferedWriter(OutputStream out) --> BufferedReader �� ������ �������� ��� �Ѵ�. 
		 * ���
		 * writer -> ���� �����͸� ��� flush --> ���� �ȿ� �����ִ� ������ ��� close --> ��� ���� 
		 * �� �� ������ �׸��� ��Ʈ�� ������ش�.
		 */
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		 * StringTokenizer() -> ���ڿ� ������ --> default : space�� �������� �����Ѵ�.
		 * StringTokenizer(���ڿ�,������,true/false) true/false -->
		 * ���ڿ� �и� �� �����ڸ� ��ū ����� ����(true) ��������(false)
		 * nextToken() �����ڷ� �������� �����ʹ� �� ���� �ϳ��� ��ū�� ��� �ȴ�.
		 * ������ ��ū�� ��� ����ϰ��� �Ѵٸ� for, while(hasMoreToken) ���� ����� ���� ����Ѵ�.
		 */
		
		
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine()); // -> �ݺ� Ƚ �� ������ ���� readLine

		for (int i = 0; i < T; i++) {
			// -> �� ���� ���� ���ϱ� ���� readLine
			// -> space�� �����ϱ� ���� StringTokenizer ���
			st = new StringTokenizer(br.readLine());
			
			// ��½� Integer.parseInt�� ����ϴ� ����
			// BufferedReader�� ���� �Է� ���� �����ʹ� �⺻������ String Ÿ���̴�.
			// ���� Ÿ������ ����ϰ��� �Ѵٸ� Integer.parseInt ���� ����� �ɽ����Ѵ�.
			// �Է� ���� st�� ���� str Ÿ���̱� ������ ������ �ɽ���
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		bw.flush();
		bw.close();

	}

}
