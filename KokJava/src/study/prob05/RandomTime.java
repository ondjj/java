package study.prob05;

public class RandomTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random() * (12-8)) + 8;
		
		switch (time) {
		
		case 8 :
			System.out.println("8: \"출근합니다.\"");
			break;
		case 9 :
			System.out.println("9: \"회의를 합니다.\"");
			break;
		case 10 :
			System.out.println("10: \"업무를 봅니다.\"");
			break;
		default :
			System.out.println("그 외 : \"외근합니다.\"");
		}

	}

}
