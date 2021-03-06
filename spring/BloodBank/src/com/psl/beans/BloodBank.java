package com.psl.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class BloodBank {

	@Min(value = 1)
	private int id;
	@Size(min = 5, max = 15, message = "Name has to be between 5-15 characters long")
	private String name;
	@Size(min = 1)
	private String blood_grp;

	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", blood_grp="
				+ blood_grp + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlood_grp() {
		return blood_grp;
	}

	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BloodBank() {
		// TODO Auto-generated constructor stub
	}

	public BloodBank(int id, String name, String blood_grp) {

		this.id = id;
		this.name = name;
		this.blood_grp = blood_grp;
	}

	// private int id;
	// private String name;
	// private int age;
	// private String bloodgroup;
	//
	// public BloodBank() {
	// }
	//
	// public BloodBank(int id, String name, int age, String bloodgroup) {
	// this.id = id;
	// this.name = name;
	// this.age = age;
	// this.bloodgroup = bloodgroup;
	// }
	//
	// public int getId() {
	// return id;
	// }
	//
	// public void setId(int id) {
	// this.id = id;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public int getAge() {
	// return age;
	// }
	//
	// public void setAge(int age) {
	// this.age = age;
	// }
	//
	// public String getBloodgroup() {
	// return bloodgroup;
	// }
	//
	// public void setBloodgroup(String bloodgroup) {
	// this.bloodgroup = bloodgroup;
	// }
	//
	// @Override
	// public String toString() {
	// return "BloodBank [id=" + id + ", name=" + name + ", age=" + age
	// + ", bloodgroup=" + bloodgroup + "]";
	// }

}
