package com.example.rjany.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity //mark class as entity
@Table //defining class name as Table name
public class Student {
	
	@Column //defining id as primary key
	@Id
	@NotNull(message = "Please provide a Id")
	private Long id;


	@NotBlank(message = "Please provide a Name ")
	@Column 
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
