package com.app.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int flatno;
	private String locality;
	private String state;
	private long pincode;

	public Address() {

	}

	public Address(int flatno, String locality, String state, long pincode) {
		super();
		this.flatno = flatno;
		this.locality = locality;
		this.state = state;
		this.pincode = pincode;
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
