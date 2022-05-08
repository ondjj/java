import java.util.Arrays;  // Arrays.toString()을 사용하기 위해 추가

class Ex5_1_tmp {
	public static void main(String[] args) {
//		int[] score; //	1. 배열 score를 선언 (참조 변수)
//		score = new int[5]; //	2. 배열의 생성(int 저장공간 x 5)
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에
		score[3] = 100;
		
		System.out.println("score[3]="+score[3]);
		
		int value = score[3];
		System.out.println("value="+value);
	}
}