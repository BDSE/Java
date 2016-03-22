
package datastructures;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 8, 6, 7, 3, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortSelection(arr)));
	}

	public static int[] sortSelection(int[] arr) {
		int minIndex = 0;
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			minIndex = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					System.out.println(minIndex);
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
