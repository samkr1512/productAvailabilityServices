package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "location_details", schema = "sys")
@Entity
public class LocationDetails {

	@Id
	@Column(name = "location_id")
	private BigInteger locationId;
	@Column(name = "location_name")
	private String locationName;
	@Column(name = "address_line1")
	private String addressLine1;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;

	public BigInteger getLocationId() {
		return locationId;
	}

	public void setLocationId(BigInteger locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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

	public String getZip() {
		return state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
