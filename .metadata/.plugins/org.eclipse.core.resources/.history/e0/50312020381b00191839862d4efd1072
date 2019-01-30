package com.qa.persistence.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.qa.persistence.repository.ClassDBRepository;


@Entity
public class Classroom implements Serializable{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String classroomID;
	private String trainer;
	private String trainees;
	@Inject
	 private ClassDBRepository repo;
	
//	 @OneToMany(mappedBy="classroomID")
//	private List<Trainee> trainee;

	 //TODO
	

//	public List<Trainee> getTrainees() {
//		return trainee;
//	}
//	
//	public void setTrainees(List<Trainee> trainees) {
//		this.trainee = trainees;
//	}
	public Classroom() {
	
}
		
	public Classroom(String trainer, String classroomID) {
		this.trainer = trainer;
		this.classroomID=classroomID;	
		this.trainees= repo.getAllTraineesFromClass(classroomID);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(String classroomID) {
		this.classroomID = classroomID;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	
}
