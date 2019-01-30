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
import com.qa.service.TraineeService;
@Path("/class")
public class ClassEndpoint {

	@Inject
	private TraineeService service;
	
	@Path("/getAllAccounts/{cId}")
	@GET
	@Produces({ "application/json" })
	public String getAllTraineesFromClass(@PathParam("cId") String cId) {
		return service.getAllTraineesFromClass(cId);
	}

	@Path("/createAccount")
	@POST
	@Produces({ "application/json" })
	public String createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") int id) {
		return service.deleteTrainee(id);
	}
	
	@Path("/updateAccount/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateTrainee(@PathParam("id") int id, String trainee) {
		return service.updateTrainee(id, trainee);
	}

	public void setService(TraineeService service) {
		this.service = service;
	}

}
