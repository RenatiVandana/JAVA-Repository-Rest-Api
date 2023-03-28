package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/vandhu")
public class Hyd {

	// public static void main(String[] args) {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/hyd/{a},{b}")
	public String vandhu(@PathParam("a") String x, @PathParam("b") int y) {

		String str = x;
		int num = y;
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			if (i != 0 && i % num == 0) {
				st += "_";
			}
			st += str.charAt(i);
		}
		return st;
	}

}
