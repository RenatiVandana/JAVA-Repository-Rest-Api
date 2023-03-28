package com.iam.restapi;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/array")
public class Array {
	int array[];

	public String create(int x) {
		if (x > 0) {
			array = new int[x];
		}
		return "array created";
	}

	public void add(int a) {
		for (int i = 0; i < array.length; i++) {
			array[i] = a * (i + 1);
			// result += a + " * " + i + " = " + a * i + "<br>";
		}

	}

	public String readarray() {
		return Arrays.toString(array);
	}
}
