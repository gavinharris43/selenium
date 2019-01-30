package com.qa.persistence.repository;
import java.util.HashMap;
import java.util.Map;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;
import java.util.Map;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Trainee;
// import com.qa.business.service.AccountService;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllTraineesFromClass(String classID) {
		
	Query query = manager.createQuery("Select a FROM Trainee a WHERE ClassID="+classID);
	Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
	return util.getJSONForObject(trainees);
	}
	
	@Override
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee anTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(anTrainee);
		String classID=anTrainee.getClassroomID();
		return "{\"message\": \"Trainee has been sucessfully added to Class"+ classID+" \"}";
	}
	
	@Override
	@Transactional(REQUIRED)
	public String deleteTrainee(int ID) {
		Trainee traineeInDB = findTrainee(ID);
	if (traineeInDB != null ) {
			manager.remove(traineeInDB);
		return "{\"message\": \"Account sucessfully deleted\"}";
		}
		return "{\"message\": \"Account not found\"}";
		
	}
	@Override
	@Transactional(REQUIRED)
	public String updateTrainee(int ID, String trainee) {
		Trainee accountInDB = findTrainee(ID);
		 deleteTrainee(ID);
		 createTrainee(trainee);
		 return "{\"message\": \"Trainee sucessfully updated\"}";
	}

	private Trainee findTrainee(int Id) {
		return manager.find(Trainee.class, Id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}




}
