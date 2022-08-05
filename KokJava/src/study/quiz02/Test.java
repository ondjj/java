package study.quiz02;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		for(;;) {
			System.out.println("작업선택(1: 삽입, 2: 삭제)");
			int choice = sc.nextInt();
			if(choice == 1) {
				
				System.out.print("삽입할 위치 : ");
				int addIndex = sc.nextInt();		//삽입할 index
				System.out.print("삽입할 값 : ");		
				int addValue = sc.nextInt();		//삽입할 value
					for (int i = 0; i < arr.length; i++) {
					if(addIndex == i) {
						for(int j=i-addIndex; j>=0; j--) {
							int temp = arr[i+1];
							arr[i+1] = arr[i];
							arr[i] = addValue;		
	
						}
						break;
					}
				}
				System.out.println(Arrays.toString(arr) + "\n");
				
//			}else if(choice == 2) {
//				System.out.print("삭제할 위치 : ");
//				int deleteIndex = sc.nextInt();			//삭제할 index
//				for (int i = 0; i < arr.length; i++) {
//					if(deleteIndex == i) {
//						for (int j = deleteIndex; j < arr.length - deleteIndex; j++) {
//							arr[i] = arr[i+1];
//						}
//					}
//				}
//			}
		
		}
	}
	}
}
