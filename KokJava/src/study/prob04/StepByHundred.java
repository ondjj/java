package study.prob04;

public class StepByHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // �� ���� ������ ����
		int s = 1; // ���� ��ȣ�� �ٲ��ִµ� ����� ����
		int num = 0;
		
		// ���ǽ��� ���� true�̹Ƿ� ���� �ݺ�
		for(int i=1; true; i++, s=-s) { //  �� �ݺ����� s�� ���� 1, -1, 1, -1 ....
			num = s * i;
			sum += num;
			
			if (sum>=100)
				break;
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);

	}

}
