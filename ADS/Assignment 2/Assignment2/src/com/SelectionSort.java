package com;

import java.util.Arrays;

public class SelectionSort {

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] < arr[j]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

}
