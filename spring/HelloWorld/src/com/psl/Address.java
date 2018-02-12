package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("address")
public class Address {

	@Value(value="FC Rd")
	private String street;
	@Value(value="pune")
	private String city;
	@Value(value="401157")
	private String zip;

	public Address() {
		System.out.println("addr default");

	}

	public Address(String street, String city, String zip) {
		System.out.println("addr parametrized");

		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	public Address(String street, String city) {
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
				+ "]";
	}

	public void abc() {
		System.out.println("addr initi");

	}

	public void pqr() {
		System.out.println("addr destroy");
	}
}