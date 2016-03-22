package com.rs.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("welcome")
public class RestService {
	
	@Path("/hello/{param}")
	@GET
	public Response getMessage(@PathParam("param") String name){
		String msg = "Welcome to your first rest service " + name;
		
		return Response.status(200).entity(msg).build();
		
	}

}
