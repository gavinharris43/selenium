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

import com.qa.persistence.domain.Class;
// import com.qa.business.service.AccountService;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassDBRepository implements ClassRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllClasses(String classID) {
		
	Query query = manager.createQuery("Select a FROM Class a");
	Collection<Class> classes = (Collection<Class>) query.getResultList();
	return util.getJSONForObject(classes);
	}
	
	@Override
	@Transactional(REQUIRED)
	public String createClass(String clas) {
		Class anClass = util.getObjectForJSON(clas, Class.class);
		manager.persist(anClass);
		String classTrainer=anClass.getTrainer();
		return "{\"message\": \"Class has been sucessfully added. Trainer: "+ classTrainer+" \"}";
	}
	
	@Override
	@Transactional(REQUIRED)
	public String deleteClass(int ID) {
		Class classInDB = findClass(ID);
	if (classInDB != null ) {
			manager.remove(classInDB);
		return "{\"message\": \"Class sucessfully deleted\"}";
		}
		return "{\"message\": \"Class not found\"}";
		
	}
	@Override
	@Transactional(REQUIRED)
	public String updateClass(int ID, String clas) {
		Class accountInDB = findClass(ID);
		 deleteClass(ID);
		 createClass(clas);
		 return "{\"message\": \"Trainee sucessfully updated\"}";
	}

	private Class findClass(int Id) {
		return manager.find(Class.class, Id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}




}
