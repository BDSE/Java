package datastructures;

import java.util.Arrays;

public class BubbleSortBasic {
	public static void main(String[] args) {
		int[] arr = {10,2,8,6,7,3,10};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int[] bubbleSort(int[] arr) {
		int pointer = arr.length - 1;
		int dumpVariable;
		System.out.println(System.currentTimeMillis());
		while (pointer > 0) {
			for (int i = 0; i < pointer; i++) {
				if (arr[i] > arr[i + 1]) {
					dumpVariable = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = dumpVariable;
				}
			}
			pointer--;
		}
		System.out.println(System.currentTimeMillis());
		return arr;
	}
}
