package sec01.exam01;

public class CellPhone {
	// field
	String model;
	String color;
	
	//creater1
	
	//method
	void powerOn() { System.out.println("������ �մϴ�.");}
	void powerOff() { System.out.println("������ ���ϴ�.");}
	void bell() { System.out.println("���� �︳�ϴ�."); }
	void sendVoice(String message) { System.out.println("�ڱ�: " + message); }
	void receiveVoice(String message) { System.out.println("����: " + message); }
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }

}