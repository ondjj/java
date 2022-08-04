package study.prob05;

public class ChangeMoneyVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercies5_7 3120");
			System.exit(0);
		}
		
		// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; // ������ ����
		int[] coin = {5, 5, 5, 5}; //������ ������ ����
		
		for (int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			
			//1. �ݾ��� ���� ������ ���� �ʿ��� ������ ����(coinNUM)�� ���Ѵ�.
			coinNum = money/coinUnit[i];
			
			//2. �迭 coin���� coinNUM��ŭ�� ������ ����.
			if(coin[i]>=coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] =0;
			}
			//3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			money -= coinNum*coinUnit[i];
			
			System.out.println(coinUnit[i]+"��: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷��� �����Ѵ�.
		}
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��"+coin[i]);
		}

	}

}
