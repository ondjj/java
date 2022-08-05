package sec04;

public class Formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전창준");
		System.out.print("전창준");
		System.out.print("전창준\n");
		System.out.printf("이름:%s 나이:%d 취미:%s \n", "전창준",28, "낚시");
		System.out.printf("이름: %2$s | 주소 : %1$s | 번호 : %s \n", "전창준", "광주 북구", "010-2251-6108");
		
		int a = 1241;
		//System.out.printf("형식 문자열", 값1, 값2, ...);
		//개발자가 원하는 문자열 형태로 출력하기 위한 메소드
		
		System.out.printf("%d \n", a);
		System.out.printf("%8d \n", a);
		System.out.printf("%-8d \n", a);
		System.out.printf("%08d \n", a);
		
		double b = 147.245;
		System.out.printf("%f \n",b);
		System.out.printf("%8.2f \n",b);
		System.out.printf("%-8.2f \n",b);
		System.out.printf("%08.2f \n",b);
		
		String c = "way";
		System.out.printf("%s \n",c);
		System.out.printf("%6s \n",c);
		System.out.printf("%-6s \n",c);
//		System.out.printf("%06s \n",c); 문자열에 0을 붙이면 에러가 발생한다.
		
		int prob = 123;
		System.out.printf("상품의 가격:%d원 \n", prob);
		System.out.printf("상품의 가격:%6d원 \n", prob);
		System.out.printf("상품의 가격:%-6d원 \n", prob);
		System.out.printf("상품의 가격:%06d원 \n", prob);
		
		double won = 314.16;
		System.out.printf("반지름이 %2$d인 원의 넓이:%1$f \n",won, 10);
		System.out.printf("반지름이 %2$d인 원의 넓이:%1$10.2f \n",won, 10);
		System.out.printf("반지름이 %2$d인 원의 넓이:%1$-10.2f \n",won, 10);
		System.out.printf("반지름이 %2$d인 원의 넓이:%1$010.2f \n",won, 10);
		
		String name = "jeon";
		String str = "국제";
		
		System.out.printf("이름 : %s\t 소속 : %s",name,str);
		System.out.println();
		
		System.out.printf("상품명 : %s\t| 가격 : %4d원\t | 수량 : %2d개 \n", "사탕", 500, 3);
		System.out.printf("상품명 : %s\t| 가격 : %4d원\t | 수량 : %2d개 \n", "생수", 1000, 10);
		
		double x = 1.23456;
		System.out.printf("실수x의 값 :%8.3f \n", x);
		System.out.printf("실수x의 값 :%-8.3f \n", x);
		System.out.printf("실수x의 값 :%08.3f \n", x);

	}

}
