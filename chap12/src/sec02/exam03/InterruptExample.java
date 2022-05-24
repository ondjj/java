package sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		thread.interrupt(); // 스레드를 종료 시키기 위해 오류 발생 시킴

	}

}
