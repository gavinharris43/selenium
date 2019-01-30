package com.qa.persistence.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Class implements Serializable{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String classroomID;
	private String trainer;
	@OneToMany(mappedBy="classroomID")
	private Set<Trainee> trainees;
	

	public Class() {
		
		
	}
	public Class(String trainer, String classroomID) {
		this.trainer = trainer;
		this.classroomID=classroomID;

		
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
