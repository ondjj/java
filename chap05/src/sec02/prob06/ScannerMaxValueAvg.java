package sec02.prob06;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ScannerMaxValueAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
					
				}
			} else if(selectNo == 3) {
				for(int k=0; k<scores.length; k++) {
					System.out.print("scores["+ k + "]>");
					System.out.println(scores[k]);
				}
			} else if(selectNo == 4) {
				
				int sum = 0;
				int max = 0;
				for(int j=0; j<scores.length; j++) {
					
					sum += scores[j];
					
					if(max < scores[j]) {
						max = scores[j];
					}
				}
				double avg = (double) sum / scores.length;
				System.out.print("�ְ� ����: ");
				System.out.println(max);
				System.out.print("��� ����: ");
				System.out.println(avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
