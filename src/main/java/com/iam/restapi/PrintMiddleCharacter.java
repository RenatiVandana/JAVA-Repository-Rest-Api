package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/middle")
public class PrintMiddleCharacter {
	@GET
	@Path("/{s}")
	@Produces(MediaType.TEXT_HTML) 
	public String middle(@PathParam("s") String str) {
		String s1 = str;
		String s2 = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i].length() / 2; // position
			if (arr[i].length() % 2 == 0) {
				s2 += arr[i].charAt(n - 1);
				s2 += arr[i].charAt(n);
			} else {
				s2 += arr[i].charAt(n);

			}
		}
		return s2;
	}
}
