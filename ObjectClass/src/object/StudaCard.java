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
		this(1, true); //StudaCard(1, true)�� ȣ���Ѵ�.
	}
	
	su(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() { // ���ڸ� ���ڿ��� ��ȯ�Ѵ�. ���� ��� k�� �����δ�.
		return num + (isKwang ? "K":"");
	}

}
