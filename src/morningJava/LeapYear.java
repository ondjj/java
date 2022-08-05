package morningJava;

public class LeapYear {

	public static void main(String[] args) {
		/*
		 * 랜덤값 1900~2004 까지 30개를 생성합니다. 그 중에서 윤년은 ar 배열에 , 윤년이 아닌 것은 br 배열에 담은 뒤 ar 배열과
		 * br 배열을 출력합니다. ( 단 0 값은 출력하지 않습니다.) ( 이중 for문 사용금지 )
		 * 
		 * 윤년이란 ? 윤년은 4의 배수 이면서 ,100의 배수가 아닐 때 또는 400의 배수일 때입니다.
		 */

		int[] arrRandom = new int[30];
		int[] ar = new int[30];
		int[] br = new int[30];
		int arcnt = 0;
		int brcnt = 0;

		for (int i = 0; i < arrRandom.length; i++) {
			arrRandom[i] = (int) (Math.random() * (2004 - 1900) + 1900) + 1;
			System.out.print(arrRandom[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arrRandom.length; i++) {

			if ((arrRandom[i] % 4 == 0) && (arrRandom[i] % 100 != 0) || (arrRandom[i] % 400 == 0)) {
				ar[arcnt] = arrRandom[i];
				arcnt ++;
			} else {
				br[brcnt] = arrRandom[i];
				brcnt++;
			}
		}
		
		System.out.print("윤년 : ");
		for (int i : ar) {
			if (i == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("윤년 아님 : ");
		for (int i : br) {
			if (i == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		
	}

}
