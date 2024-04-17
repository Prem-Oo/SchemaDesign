package com.schema.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ExamCourse  extends BaseModel{

	@ManyToOne
	private Exam exam; // EC : E => M : 1
	@ManyToOne
	private Course course;// EC : C => M : 1
	private Date date;
}
