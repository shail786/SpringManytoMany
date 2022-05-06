package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Person {
	
	@Id
	private Integer id;
	private String fName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String fName, String lName, String contact, String gender, Profile prob) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
		this.gender = gender;
		this.prob = prob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Profile getProb() {
		return prob;
	}

	public void setProb(Profile prob) {
		this.prob = prob;
	}

	private String lName;
	private String contact;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name = "pr_id_fk", unique = true)
	private Profile prob;

}
