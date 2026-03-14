package day7;

public class MoveZero {

	public static void main(String[] args) {

		int[] arr = { 66, 3, 0, 45, 1, 0, 55, 0, 99, 25 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				count++;

			}
		}
		
		for(int p: arr) {
			System.out.print(p +" ");
		}

	}

}
