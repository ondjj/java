package study.quiz01;

public class Quiz0712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] degit = {2200,1400,3200,2900,4500,3000,800,3400};
		int sum =0; 
		
		for(int i=0; i<degit.length;i++) {
			if(degit[i] <= 2000) {
				sum += degit[i];
			}
		}
		System.out.println("2000���� �ݾ��� ��: " + sum);
		
		String[] local = {"�ѱ�","����","����","�λ�","�ϱ�","����","����","�����","��ġ��"};
		
		for(int i=0;i<local.length;i++) {
			if(local[i]=="�ѱ�") {
				System.out.printf("%s - ",local[i]);
			}else if(local[i]=="����") {
				System.out.printf("%s ",local[i]);
			}else if(local[i]=="�ϱ�") {
				System.out.printf("%s ",local[i]);
			}else if(local[i]=="�����") {
				System.out.printf("%s \n",local[i]);
			}
		}
		
		for(int i=0;i<local.length;i++) {
			if(local[i]=="�ϱ�") {
				local[i] = "���걸";
				System.out.println(local[i]);
			}
		}
		
		for(int i=0;i<local.length;i++) {
			System.out.println(local[i]);
		}

	}

}
