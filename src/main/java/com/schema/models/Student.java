package com.schema.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student extends BaseModel{

	private String name;
	private String email;
	private String password;
	private String college;
	
//	// mappedBy is important if we write same relationship in both ManyToMany classes.(Bi-directional)
//	@ManyToMany(mappedBy = "students") // to avoid creating 2 mapping tables.(other from Course -- @ManytoMany)
//	private List<Course> courses;
//	
}
