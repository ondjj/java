package study.prob02;

public class AppleBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucker = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucker);

	}

}
