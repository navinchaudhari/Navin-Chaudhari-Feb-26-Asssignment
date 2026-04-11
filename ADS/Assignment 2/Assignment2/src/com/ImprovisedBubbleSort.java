package com;

import java.util.Arrays;

public class ImprovisedBubbleSort {

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	static void bubble(int[] arr) {
		boolean swapped = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String[] args) {
//		int arr[] = { 5, 4, 3, 2, 1 };
		int arr[] = {1, 2, 3, 4, 5 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

}
