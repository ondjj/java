package sec01.prob07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��� ���α׷��� �ڹ� ���� ���� �� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		if (index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
		}
		str = str.replace("�ڹ�", "Java");
		System.out.println("-->" + str);

	}

}
