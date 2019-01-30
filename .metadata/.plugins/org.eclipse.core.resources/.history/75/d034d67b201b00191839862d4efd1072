package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.service.ClassService;
import com.qa.service.TraineeService;
@Path("/class")
public class ClassEndpoint {

	@Inject
	private ClassService service;
	
	@Path("/getAllClasses/")
	@GET
	@Produces({ "application/json" })
	public String getAllClasses() {
		return service.getAllClasses();
	}

	@Path("/createClass")
	@POST
	@Produces({ "application/json" })
	public String createClass(String trainee) {
		return service.createClass(trainee);
	}

	@Path("/deleteClass/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClass(@PathParam("id") int id) {
		return service.deleteClass(id);
	}
	
	@Path("/updateClass/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateClass(@PathParam("id") int id, String clas) {
		return service.updateClass(id, clas);
	}

	public void setService(ClassService service) {
		this.service = service;
	}

}
