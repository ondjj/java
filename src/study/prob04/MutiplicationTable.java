package study.prob04;

public class MutiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=3;j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0?3:i%3;
				
				if(x>9) // 9�ܱ����� ����ϰ� ���ִ� �ڵ�
					break;
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
		System.out.println("===========================");
		for(int k=2;k<10;k+=3) { // ��Ϻ� �� ����
			for(int i=1;i<=3;i++) { // ���ϴ� ��
				for(int j=k; j<=k+2 && j<10;j++) { // ��
					System.out.print(j+"*"+i+"="+j*i+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
