package datastructures;

import java.util.Arrays;

public class QuickSort {

	public void sort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			sort(arr, start, pivot - 1);
			sort(arr, pivot + 1, end);

		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start;
		int inter;
		for (int j = start; j <= end; j++) {
			if (arr[j] < pivot) {
				inter = arr[j];
				arr[j] = arr[i];
				arr[i] = inter;
				i++;
			}
		}

		inter = arr[end];
		arr[end] = arr[i];
		arr[i] = inter;
		return i;
	}
	public void quickSort(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		sort(arr, start, end);
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = { 11,7,8,12,17 };
		qs.quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
