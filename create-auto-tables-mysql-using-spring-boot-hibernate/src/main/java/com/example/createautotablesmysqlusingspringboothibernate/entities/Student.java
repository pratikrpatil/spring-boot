package com.example.createautotablesmysqlusingspringboothibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
	
	@Id
	@Column(name = "id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lName;

	public Student(String fname, String lName) {
		super();
		this.fname = fname;
		this.lName = lName;
	}

}
