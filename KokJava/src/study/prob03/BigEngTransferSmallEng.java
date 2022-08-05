package study.prob03;

public class BigEngTransferSmallEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char) (ch+32):ch;
		
		System.out.println("ch: " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);

	}

}
