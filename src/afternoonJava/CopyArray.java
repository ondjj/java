package afternoonJava;

public class CopyArray {

	public static void main(String[] args) {
		// for
		
		// System.arrcopy(원본배열, 시작 인덱스, 새 배열,새 배열 시작 인덱스, 복사할 개 수)
		
		String[] arr = {"java","system","arrcopy"};
		
		String[] newArr = new String[5];
		
		System.arraycopy(arr, 0, newArr, 0, arr.length);

		for (String string : newArr) {
			System.out.print(string+" ");
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+ " ");
		}
	}

}
