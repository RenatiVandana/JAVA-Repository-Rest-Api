package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class DuplicateElements {
	public static void main(String[] args) {
		String[] names = { "Jack", "Kite", "Kite", "Jack", "Pam" };

		compare(names);

	}

	public static boolean compare(String[] arr) {
		boolean duplicates = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println("Element '" + arr[i] + "' is duplicated.");
					duplicates = true;
				}
			}
		}
		return duplicates;
	}
}
