package object;

class Student {
	public static void main(String[] args) {
		Student_info s = new Student_info("홍길동",1,1,100,60,76);
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;

		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		System.out.println(s.info());
	}
}

class Student_info {
	
	// 인스턴스 변수
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 기본 생성자
	Student_info(){
	}
	
	// 생성자 오버로딩 & this
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
