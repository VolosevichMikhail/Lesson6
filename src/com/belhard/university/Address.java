package com.belhard.university;

public class Address {

	private String country;
	private String city;
	private String street;
	private String house;
	private int flat;
	
	public Address(String country, String city, String street, String house) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house; 
	}
	
	public Address(String country, String city, String street, String house, int flat) {
		this(country, city, street, house);
		this.flat = flat;
	}
	

	private String getCountry() {
		return country;
	}

	private void setCountry(String country) {
		this.country = country;
	}

	private String getCity() {
		return city;
	}

	private void setCity(String city) {
		this.city = city;
	}

	private String getStreet() {
		return street;
	}

	private void setStreet(String street) {
		this.street = street;
	}

	private String getHouse() {
		return house;
	}

	private void setHouse(String house) {
		this.house = house;
	}

	private int getFlat() {
		return flat;
	}

	private void setFlat(int flat) {
		this.flat = flat;
	}

	@Override
	public String toString() {
		return " Address: " + country + ", city=" + city + ", street=" + street + ", house=" + house + ", flat=" + flat + "]";
	}
	

	

	
	
}
