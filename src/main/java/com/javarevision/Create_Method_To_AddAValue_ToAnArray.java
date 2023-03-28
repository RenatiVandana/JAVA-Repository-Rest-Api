package com.javarevision;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/add")
public class Create_Method_To_AddAValue_ToAnArray {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{a}/{b}")
	public String add(@PathParam("a") String x, @PathParam("b") String y) {
		
		return y;

	}
}