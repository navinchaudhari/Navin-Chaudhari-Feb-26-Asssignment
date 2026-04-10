package com;

public class ReverseString {

	static String reverse(String s) {

		if (s.isEmpty()) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {

		String string = "Navin";
		System.out.println("String Before Reverse: " + string);

		String reverse = reverse(string);

		System.out.println("String After Reverse: " + reverse);

	}

}
