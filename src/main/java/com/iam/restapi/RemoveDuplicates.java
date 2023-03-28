package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rem")
public class RemoveDuplicates {
	@GET
	@Path("/{a}")
	@Produces(MediaType.TEXT_HTML)
	public String remove(@PathParam("a") String c) {
		String s1 = c;
		String s2 = "";
		char c1[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {

			if (!s2.contains(c1[i] + "")) {
				s2 += c1[i];
			}
		}
		return s2;
	}
}
