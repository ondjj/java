package sec01.exam02;

public class ConvertValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int y = 5;
		int temp;

		System.out.println("x: " + x + ", y: " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x + ", y: " + y);

	}

}
