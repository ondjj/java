package sec04.exam03;


public class Car {
	//field
	int gas;
	
	//creater1
	
	//method
	
	void setGas(int gas) {
		this.gas = gas; // --> ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; 
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("go run. (gas:" + gas +")");
				gas -= 1;
			}else {
				System.out.println("stop run. (gas:" + gas + ")");
				return ; // method out
			}
		}
	}

}
