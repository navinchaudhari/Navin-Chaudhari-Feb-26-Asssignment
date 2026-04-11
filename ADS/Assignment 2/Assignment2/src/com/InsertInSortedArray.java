package com;

import java.util.Arrays;

class InsertSorted {

	public static int[] inserElement(int[] arr, int key) {
		int[] newArray = new int[arr.length + 1];

		int index = 0;
		for (int i = arr.length - 1; i >= 0 && arr[i] >= key; i--) {
			newArray[i + 1] = arr[i];
			index = i;
		}

		newArray[index] = key;

		for (int j = 0; j < index; j++) {
			newArray[j] = arr[j];
		}

		return newArray;
	}

	public static int[] insert(int[] arr, int key) {
		int n = arr.length;

		// create new array with one extra space
		int[] newArr = new int[n + 1];

		int i;

		// shift elements to right
		for (i = n - 1; i >= 0 && arr[i] > key; i--) {
			newArr[i + 1] = arr[i];
		}

		// place key at correct position
		newArr[i + 1] = key;

		// copy remaining elements
		for (int j = 0; j <= i; j++) {
			newArr[j] = arr[j];
		}

		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 5, 7 };
		int key = 4;

		int[] result = inserElement(arr, key);
		System.out.println(Arrays.toString(result));
	}
}
