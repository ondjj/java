package PrintExl;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple = 123;
		int bucketSize = 10;
		int bucketNum;
		
		if(apple % 10 !=0) {
			bucketNum = (apple / bucketSize) + 1;
			System.out.println("����� ��: " + apple);
			System.out.println("�ʿ��� �ٱ����� ��: " + bucketNum);
		} else {
			bucketNum = (apple / bucketSize);
			System.out.println("����� ��: " + apple);
			System.out.println("�ʿ��� �ٱ����� ��: " + bucketNum);
			
		}
		

	}

}
