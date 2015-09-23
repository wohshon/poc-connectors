package com.redhat;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/")
public class Document {

	@GET
    @Path("/list/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDocumentList(){
	//public Response getDocumentList(){
        return null;
    }
	
	@GET
    @Path("/list/{key}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDocument(@PathParam("key") String key){
        return null;
    }

	
	@POST
    @Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
    public String doPost(String inputFile, String documentName, String documentType ){
        return null;
    }
}
