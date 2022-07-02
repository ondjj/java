package PrintExl;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple = 123;
		int bucketSize = 10;
		int bucketNum;
		
		if(apple % 10 !=0) {
			bucketNum = (apple / bucketSize) + 1;
			System.out.println("사과의 수: " + apple);
			System.out.println("필요한 바구니의 수: " + bucketNum);
		} else {
			bucketNum = (apple / bucketSize);
			System.out.println("사과의 수: " + apple);
			System.out.println("필요한 바구니의 수: " + bucketNum);
			
		}
		

	}

}
