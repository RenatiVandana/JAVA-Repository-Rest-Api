package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/large")
public class FindLargerValue {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{b}")
	public String dupli(@PathParam("b") String s) {

		String[] arr = s.split(" ");
		String s1 = arr[0];
		int max = arr[0].length();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max) {
				s1 = arr[i];
				max = arr[i].length();
			}
		}

		return s1;

	}
}
