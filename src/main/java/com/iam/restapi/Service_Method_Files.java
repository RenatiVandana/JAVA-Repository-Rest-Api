package com.iam.restapi;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/fileservice")
public class Service_Method_Files {
	@GET
	@Path("/copypaste")
	public String copy() throws Exception {
		ReadFile file = new ReadFile();
		file.copyPaste();
		return "file_copied";
	}

	@GET
	@Path("/cutpaste")
	public String cut() throws Exception {
		ReadFile file = new ReadFile();
		file.cutPaste();
		return "file_deleted";
	}

	@GET
	@Path("cutrename")
	public String rename() {
		ReadFile file = new ReadFile();
		file.cutByRename();
		return "renamed";

	}
}
