package sec04.exam06;

public class CalcuratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcuator myCalc = new Calcuator();
		
		// ���簢�� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);
		
		// ���簢�� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("���簢���� ����=" + result1);
		System.out.println("���簢���� ����=" + result2);

	}

}
