package sec05.exam05;

public class PsersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		System.out.println(p1.nationString);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "ȫ���";
		System.out.println(p1.name);

	}

}
