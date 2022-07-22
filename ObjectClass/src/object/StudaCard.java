package object;

class StudaCard {
	public static void main(String args[]) {
		su card1 = new su(3, false);
		su card2 = new su();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}

class su {
	
	int num;
	boolean isKwang;
	
	su() {
		this(1, true); //StudaCard(1, true)를 호출한다.
	}
	
	su(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() { // 숫자를 문자열로 반환한다. 광인 경우 k를 덧붙인다.
		return num + (isKwang ? "K":"");
	}

}
