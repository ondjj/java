package sort;

public class SelectionSort_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,1,2,4};
		int temp;
		
		for(int i=0; i < a.length; i++) {
			for(int j= i+1; j < a.length; j++) { // i+1로 하는 이유 -> 선택 정렬은 왼쪽부터 순차 정렬 되기 때문에 한 번 정렬된걸 다시 확인 할 필요가 없다.
					// i+1로 할 경우 1,2,3,4 - 2,3,4 - 3,4 - 4 번 반복 할 수 있다.
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
