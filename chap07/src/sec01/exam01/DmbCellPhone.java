package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	
	//field
	int channel;
	
	//creater1
	DmbCellPhone(String model, String color, int channel) {
		this.model = model; // --> cellphone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.color = color;
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
