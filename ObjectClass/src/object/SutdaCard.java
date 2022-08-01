package object;

class SutdaCard {
	public static void main(String[] args) {
		SutdaCard_info card1 = new SutdaCard_info(3, false);
		SutdaCard_info card2 = new SutdaCard_info();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}


class SutdaCard_info {
	// instance value 선언
	int num;
	boolean isKwang;
	
	// 기본 생성자 생성
	SutdaCard_info() {
		this(1, true);
	}
	
	// 생성자 this & 오버로딩--
	SutdaCard_info(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : ""); // 숫자를 문자열로 반환한다. 광인 경우 k를 덧붙인다.
	}

}
