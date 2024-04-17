package com.schema.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Course  extends BaseModel{

	private String name;
	
	@ManyToMany
	private List<Student> students;// C : S => M : M (many to many)
	
	
}
