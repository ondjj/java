package object;

class Student {
	public static void main(String[] args) {
		Student_info s = new Student_info("ȫ�浿",1,1,100,60,76);
//		s.name = "ȫ�浿";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;

		System.out.println("�̸�:" + s.name);
		System.out.println("����:" + s.getTotal());
		System.out.println("���:" + s.getAverage());
		System.out.println(s.info());
	}
}

class Student_info {
	
	// �ν��Ͻ� ����
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// �⺻ ������
	Student_info(){
	}
	
	// ������ �����ε� & this
	Student_info(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
	
	public String info() {
		return name
				+ ","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage();
	}

}
