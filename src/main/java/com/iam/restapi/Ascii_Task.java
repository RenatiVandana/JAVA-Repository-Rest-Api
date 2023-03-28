package com.iam.restapi;

public class Ascii_Task {
	public String ascii() {
		String str = "vandana"; //
		char[] ch = str.toCharArray();
		int[] arr = new int[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ch[i]; // received ascii value
		}
		int rev = 0;
		int[] ar = new int[arr.length];
		for (int j = 0; j < ar.length; j++) {
			while (ar[j] != 0) {
				int rem = ar[j] % 10;
				rev = rev * ar[j] + rem;
				ar[j] = ar[j] / 10;
			}
		}
		return str;

	}
}
