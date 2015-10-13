package com.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/")
public class LoggingService {

	@GET
	@Path("/test")
	public String test(String input) {
		return null;
	}
	@POST
	@Path("/xml/search")
	//@Path("/log/xml/search")
	@Produces(MediaType.APPLICATION_XML)
	public String searchByXML(String input) {
		return null;
	}
	
	@POST	
	@Path("/json/search")
	//@Path("/log/json/search")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String searchByJSON(String input) {
		return null;
	}
	
	@GET
	@Path("/xml/detail/{id}")
	//@Path("/log/xml/detail/{id}")
	@Produces(MediaType.APPLICATION_XML)	
	public String getDetailByXML(@PathParam("id") String id) {
		return null;
	}
	@GET
	@Path("/json/detail/{id}")
	//@Path("/log/json/detail/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	public String getDetailByJSON(@PathParam("id") String id) {
		return null;
	}
	@POST
	@Path("/xml/write")
	//@Path("/log/xml/write")
	@Produces(MediaType.APPLICATION_XML)	
	public String writeByXML(String input){
		return null;
	}
	@POST
	@Path("/json/write")
	//@Path("/log/json/write")
	@Produces(MediaType.APPLICATION_JSON)	
	public String writeByJSON(String input){
		return null;
	}

	@POST
	//@Path("/log/xml/purge")
	@Path("/xml/purge")
	@Produces(MediaType.APPLICATION_XML)		
	public String purgeByXML(String input){
		return null;
	}

	@POST
	@Path("/json/purge")
//	@Path("/log/json/purge")
	@Produces(MediaType.APPLICATION_JSON)	
	public String purgeByJSON(String input){
		return null;
	}
	
}
