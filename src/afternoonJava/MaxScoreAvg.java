package afternoonJava;

import java.util.Scanner;

public class MaxScoreAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------");

			System.out.print("����> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d] \n> ", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {

					System.out.printf("scores[%d]> %d\n", i, scores[i] );
				}

			} else if (selectNo == 4) {

				System.out.print("�ְ� ����> ");
				int max = 0;
				int sum =0;
				double avg = 0.0;
				for (int i : scores) {
					if (max < i) {
						max = i;
					}
						sum+=i;
				}
				avg = (double)sum/scores.length;
				System.out.print(max + "\n");

				System.out.print("��� ����> ");
				
				System.out.println(avg);

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");

	}

}
