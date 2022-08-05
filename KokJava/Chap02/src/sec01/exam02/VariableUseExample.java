package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");

		String name = "전창준 ";
		String addr = "광주 국제";
		
		System.out.println(name + addr);
	}

}
