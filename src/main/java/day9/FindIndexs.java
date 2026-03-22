package day9;

public class FindIndexs {

	public static void main(String[] args) {

		int[] arr = { 1, 43, 13, 4, 5, 6, 6, 7, 18, 9, 9 };
		int target = 3;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				 System.out.println("Element found at index: " + i);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}

	}

}
