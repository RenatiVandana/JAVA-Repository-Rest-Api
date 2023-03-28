package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/try")
public class TryCatch {
	@GET
	@Path("/catch/{s}")
	@Produces(MediaType.TEXT_HTML)
	public String integer(@PathParam("s") String a) {
		try {
			int x = Integer.parseInt(a);
			return "Integer";
		} catch (Exception e2) {
			try {
				float y = Float.parseFloat(a);
				return "Float";
			} catch (Exception e) {
				try {
					boolean z = Boolean.parseBoolean(a);
					return "Boolean";
				} catch (Exception e3) {
					return "String";
				}
			}
		}
	}
}
