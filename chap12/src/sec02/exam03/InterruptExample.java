package sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		thread.interrupt(); // �����带 ���� ��Ű�� ���� ���� �߻� ��Ŵ

	}

}
