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
	// instance value ����
	int num;
	boolean isKwang;
	
	// �⺻ ������ ����
	SutdaCard_info() {
		this(1, true);
	}
	
	// ������ this & �����ε�--
	SutdaCard_info(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : ""); // ���ڸ� ���ڿ��� ��ȯ�Ѵ�. ���� ��� k�� �����δ�.
	}

}
