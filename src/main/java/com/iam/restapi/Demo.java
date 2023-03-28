package com.iam.restapi;

import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/math")
public class Demo {
	@GET
	@Path("/quiz/{num}")
	@Produces(MediaType.TEXT_HTML)
	public String add(@PathParam("num") String a) {
		String[] s = a.split(",");
		int count = 0;
		int n[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			n[i] = Integer.valueOf(s[i]);
		}
		for (int j = 0; j < n.length; j++) {
			if (n[j] % 2 == 0) {
				count += n[j];
			} else {
				count -= n[j];
			}
		}
		return count + "";
	}
	
	

}
