package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name")
	private String name;

	@OneToOne
	private Skill skills;

	// @Column(name = "emp_address")
	// private String address;

	// @Embedded
	// private Address addr;
	// @Embedded
	// @AttributeOverrides({
	// @AttributeOverride(column = @Column(name = "home_flatno"), name =
	// "flatno"),
	// @AttributeOverride(column = @Column(name = "home_locality"), name =
	// "locality"),
	// @AttributeOverride(column = @Column(name = "home_state"), name =
	// "state"),
	// @AttributeOverride(column = @Column(name = "home_pincode"), name =
	// "pincode")
	// })
	// private Address homeaddr;

	// @Column(name = "emp_skills")
	// private String skills;
	/*
	 * public Address getHomeaddr() { return homeaddr; }
	 * 
	 * public void setHomeaddr(Address homeaddr) { this.homeaddr = homeaddr; }
	 * 
	 * public Address getAddr() { return addr; }
	 * 
	 * public void setAddr(Address addr) { this.addr = addr; }
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill getSkills() {
		return skills;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

}
