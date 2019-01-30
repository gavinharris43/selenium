package com.qa.persistence.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Trainee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String traineeName;
	private String traineeID;
	private String classroomID;
	
	public Trainee() {
		
		
	}
	public Trainee(String traineeName,String traineeID, String classroomID) {
		this.traineeName=traineeName;
		this.traineeID=traineeID;
		this.classroomID=classroomID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(String traineeID) {
		this.traineeID = traineeID;
	}
	public String getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(String classroomID) {
		this.classroomID = classroomID;
	}
	
	
	


}
