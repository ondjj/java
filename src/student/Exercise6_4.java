package student;

public class Exercise6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("È«±æµ¿",1,1,100,60,76);
		
		System.out.println(s.info());
//		s.name = "È«±æµ¿";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
		
//		System.out.println("ÀÌ¸§:" + s.name);
//		System.out.println("ÃÑÁ¡:" + s.getTotal());
//		System.out.println("Æò±Õ:" + s.getAverage());
		

	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage() {
		return ((int)(getTotal()/ 3f * 10 + 0.5f )/ 10f);
	}
	
	String info() {
		return name + "," + ban
				+ "," + no
				+ "," + kor
				+ "," + eng
				+ "," + math
				+ "," + getTotal()
				+ "," + getAverage();
	}
}
