package com.iam.restapi;

public class ReplaceWithStar {

	public static void main(String[] args) {
		// String str = new String();
		String s1 = "van";
		String s2 = "pav";
		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			for (int j = 0; j < s2.length(); j++) {
				char c2 = s2.charAt(j);
				if (c1 == c2) {
					s2 = s2.replace(c2, '*');
				}
			}
		}
		System.out.println(s2);

	}

}
