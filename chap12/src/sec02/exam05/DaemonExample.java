package sec02.exam05;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // autosavethread를 데몬으로 만듦
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료");

	}

}
