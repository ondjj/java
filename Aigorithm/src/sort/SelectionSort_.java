package sort;

public class SelectionSort_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,1,2,4};
		int temp;
		
		for(int i=0; i < a.length; i++) {
			for(int j= i+1; j < a.length; j++) { // i+1�� �ϴ� ���� -> ���� ������ ���ʺ��� ���� ���� �Ǳ� ������ �� �� ���ĵȰ� �ٽ� Ȯ�� �� �ʿ䰡 ����.
					// i+1�� �� ��� 1,2,3,4 - 2,3,4 - 3,4 - 4 �� �ݺ� �� �� �ִ�.
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
