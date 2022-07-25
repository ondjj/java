package distance;

class MyPoint {
	int x;
	int y;
	
	MyPoint (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		return Math.sqrt((x-x1)*(x-x1) + (y-y1) * (y-y1));
		
	}
}

class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1,1);
		
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2,2));

	}

}
