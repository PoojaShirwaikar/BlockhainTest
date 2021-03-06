package com.psl;

public class Address2 {

	private String street;
	private String city;
	private String zip;
	private String landmark;

	public Address2() {
		System.out.println("addr2 default");

	}

	public Address2(String street, String city, String zip, String landmark) {
		System.out.println("addr parametrized");

		this.street = street;
		this.city = city;
		this.zip = zip;
		this.landmark = landmark;
	}

	public Address2(String street, String city) {
		System.out.println("in two param constructor");
		this.street = street;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("street");

		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		System.out.println("landmark");

		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("city");

		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		System.out.println("zip");

		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ ", landmark=" + landmark + "]";
	}

}
