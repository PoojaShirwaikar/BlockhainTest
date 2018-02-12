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

	@ElementCollection
	@JoinTable(name = "addressDetails", joinColumns = @JoinColumn(name = "empId"))
	@CollectionId(columns = { @Column(name = "address_id") }, generator = "addressIdGen", type = @Type(type = "int"))
	@GenericGenerator(name = "addressIdGen", strategy = "increment")
	private List<Address> addresses = new ArrayList<Address>();

	@Column(name = "emp_skills")
	private String skills;

	/*
	 * public Address getHomeaddr() { return homeaddr; }
	 * 
	 * public void setHomeaddr(Address homeaddr) { this.homeaddr = homeaddr; }
	 * 
	 * public Address getAddr() { return addr; }
	 * 
	 * public void setAddr(Address addr) { this.addr = addr; }
	 */

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
