/**
 * Merge sort is internally used in the java collections framework
 * @author milo
 */
package datastructures;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] data) {
		mergeSort(data, 0, data.length - 1);
	}

	private static void mergeSort(int[] data, int start, int end) {
		if (start < end) {
			int mid = (int) Math.floor((start + end) / 2);
			mergeSort(data, start, mid);
			mergeSort(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}

	/*
	 * my version of the merge method. failed version need improvement
	 */
	private static void merge2(int[] data, int start, int mid, int end) {

		int p1 = start;
		int p2 = mid + 1;
		int p3 = 0;
		int p4 = 0;
		int[] arr = new int[(end - start) + 1];

		for (int i = 0; i < (end - start) + 1; i++) {
			if (data[p1] < data[p2] && p1 <= mid && p3 == 0) {
				arr[i] = data[p1];
				if (p1 != mid) {
					p1++;
					p3 = 0;
				} else {
					p3++;
				}
			} else if (data[p2] < data[p1] && p2 <= end && p4 == 0) {
				arr[i] = data[p2];
				if (p2 != end) {
					p2++;
					p4 = 0;
				} else {
					p4++;
				}
			}
			if (i == end - start) {
				if (p4 > 0)
					arr[i] = data[end];
				if (p3 > 0)
					arr[i] = data[mid];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			data[j] = arr[j];
		}

	}

	public static void main(String[] args) {
		int[] data = { 4, 1, 6, 9, 5, 34, 5, 33 };
		sort(data);
		System.out.println(Arrays.toString(data));
	}

	// method from data structures course
	private static void merge(int[] data, int start, int mid, int end) {
		int sizeOfLeft = mid - start + 1;
		int sizeOfRight = end - mid;
		int[] left = new int[sizeOfLeft];
		int[] right = new int[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = data[start + i]; // be careful here
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = data[mid + 1 + j]; // be careful
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
		}
	}
}
