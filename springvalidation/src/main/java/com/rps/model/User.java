package com.rps.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="user_tbl")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Email should be proper format")
	private String email;
	
	@Max(value = 100, message = "Age cannot exceed 100")
	@Min(value = 18, message = "Age cannot less than 18")
	private int age;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, @NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Email is mandatory") @Email String email,
			@Max(value = 100, message = "Age cannot exceed 100") @Min(value = 18, message = "Age cannot less than 18") int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
