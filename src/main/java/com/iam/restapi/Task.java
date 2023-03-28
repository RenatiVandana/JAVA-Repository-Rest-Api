package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/task")
public class Task {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String tas() {
		Array array = new Array();
		array.create(5);
		array.add(5);
		// array.readarray();
		return array.readarray();

	}
}
