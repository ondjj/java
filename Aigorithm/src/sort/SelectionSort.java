package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// �������� �˰���(Selection Sort Algorithm)
		// ������ �����͸� ��������/�������� ����
		int[] arr = {5, 3, 1, 2, 4};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // +1�� �ϴ� ������ �ڱ�� ���� �ʿ䰡 ���� ����
				if(arr[i] > arr[j]) { // '>' �� ��� �������� '<' �� ��� ��������
					int temp = arr[i]; // �� �����ؾ� �ϱ⿡ �ӽ� ����
					arr[i] = arr[j]; // j�� i�� ����
					arr[j] = temp;  // i�� j�� ����
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // ���� �� ��� ���
		}
}