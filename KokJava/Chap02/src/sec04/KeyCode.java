package sec04;

public class KeyCode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� ��:" + keyCode);
			if(keyCode == 113)
				break;
		}

	}

}
