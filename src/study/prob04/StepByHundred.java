package study.prob04;

public class StepByHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 총 합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		// 조건식의 값이 true이므로 무한 반복
		for(int i=1; true; i++, s=-s) { //  매 반복마다 s의 값은 1, -1, 1, -1 ....
			num = s * i;
			sum += num;
			
			if (sum>=100)
				break;
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);

	}

}
