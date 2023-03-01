package com.sms.entity;

public class Address {
	private Long id;
	private String street;
	private String city;
	private String state;
	private String country;
	private Integer	pincode;
	private String addressType;
	
	public Address(Long id, String street, String city, String state, String country, Integer pincode,
			String addressType) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.addressType = addressType;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + ", addressType=" + addressType + "]";
	}
	
}
