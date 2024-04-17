package com.schema.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Exam  extends BaseModel{

	private int duration;
}
