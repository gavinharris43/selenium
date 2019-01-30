package com.qa.persistence.domain;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import antlr.collections.List;

@Entity
public class Class {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String classroomID;
	private String trainer;


//	@Size (min=6, max=6)
//	private String accountNumber;
//	private String location;

	public Class() {
		
		
	}
	public Class(String trainer, String classroomID) {
		this.trainer = trainer;
		this.classroomID=classroomID;
//		this.accountNumber = accountNumber;
//		this.location=location;
		
	}




	
	

}
