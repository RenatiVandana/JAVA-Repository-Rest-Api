package com.iam.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/duplicate")
public class AddaValueToanArray {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{a}")
	public String dupli(@PathParam("a") String s) 
	{
		String s1 = s;
		String s2 = "";
		String[] arr = s1.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i].equals(arr[j])) 
				{
					count++;
				}
			}
			if(count>1)
			{
				s2=s2+arr[i]+" ";
			}
		}
		return s2;
	}
}
