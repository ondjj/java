package sec02.exam03;

public class Tire {
	// field
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	// creater1
	public Tire(String location, int maxRotation) {
		this.location = location; // �ʱ�ȭ
		this.maxRotation = maxRotation; // �ʱ�ȭ
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1ȸ ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true; // -> ���� ȸ��(���� < �ִ�) �� ��� ����
		}else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false; // -> ��ũ (���� = �ִ�)�� ��� ����
		}
	}

}
