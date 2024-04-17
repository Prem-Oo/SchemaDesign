package com.schema.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

// all commonly shared attributes by model classes are placed here.

@Setter
@Getter
@MappedSuperclass // all attributes of this superclass have to be persisted in DB.(tells ORM to persist in DB )
public class BaseModel {

	// ID 
	// Created Date
	// LastModified Date
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date lastModifiedDate;
}
