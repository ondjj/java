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


// Ŭ���� ����(Static ����) : width , height
// �ν��Ͻ� ���� : kind, num
// ���� ���� : card, args, k, n