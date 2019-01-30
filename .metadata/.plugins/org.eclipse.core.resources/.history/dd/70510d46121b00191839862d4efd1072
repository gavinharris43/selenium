package com.qa.persistence.domain;

import java.util.Map;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.qa.persistence.repository.TraineeDBRepository;
import com.qa.service.TraineeService;

import antlr.collections.List;

@Entity
public class Class {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String classroomID;
	private String trainer;
	@Inject
	private TraineeDBRepository repo;
	private String trainees;


//	@Size (min=6, max=6)
//	private String accountNumber;
//	private String location;

	public Class() {
		
		
	}
	public Class(String trainer, String classroomID) {
		this.trainer = trainer;
		this.classroomID=classroomID;
		this.trainees= repo.getAllTraineesFromClass(classroomID);
//		this.accountNumber = accountNumber;
//		this.location=location;
		
	}




	
	

}
