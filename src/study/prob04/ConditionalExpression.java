package study.prob04;

public class ConditionalExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		char ch = 'a';
		char cha = 'x';
		char cch = '0';
		
		int year = 344;
		boolean powerOn = false;
		String str = "yes";
		
		
		if (10 < x && x < 20) {};
		if (ch != ' ' || ch != '\t') {};
		if (cha =='x' || cha =='X') {};
		if ('0' <= cch && cch <= '9') {};
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {};
		if (year % 400 ==0 || year % 4 ==0 && year % 100 !=0 ) {};
		if (powerOn == false) {};
		if (str.equals("yes")) {};

	}
}
