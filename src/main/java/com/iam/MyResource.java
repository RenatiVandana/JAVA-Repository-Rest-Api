
package com.iam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {

	/**
	 * Method processing HTTP GET requests, producing "text/plain" MIME media type.
	 * 
	 * @return String that will be send back as a response of type "text/plain".
	 */
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String getIt() {
		return "<h1>WELCOME to Vandana Renati's world !</h1>!";
	}
}
