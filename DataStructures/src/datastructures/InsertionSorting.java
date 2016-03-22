package datastructures;

import java.util.Arrays;

public class InsertionSorting {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 8, 6, 7, 3, 10 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
	public static int[] insertionSort(int[] arr) {
		int current;
		for (int i = 1; i <= arr.length - 1; i++) {
			current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		return arr;
	}
}
