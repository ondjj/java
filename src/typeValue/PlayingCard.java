package typeValue;

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		this.kind = k;
		this.num = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayingCard card = new PlayingCard(1, 1);
	}

}


// 클래스 변수(Static 변수) : width , height
// 인스턴스 변수 : kind, num
// 지역 변수 : card, args, k, n