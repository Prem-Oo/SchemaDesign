package com.schema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class StudentExamCourse extends BaseModel{

	@ManyToOne
	private Student student;     // SEC : S  =>  M : 1  (many to 1)
	@ManyToOne
	private ExamCourse examCourse; // SEC : EC ==> M : 1
	private int marks;
}
