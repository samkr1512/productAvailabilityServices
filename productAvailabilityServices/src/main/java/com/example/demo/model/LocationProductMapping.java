package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "location_product_mapping", schema = "sys")
@Entity
public class LocationProductMapping {

	@Id
	@Column(name = "location_id")
	private BigInteger locationId;

	@Column(name = "product_id")
	private BigInteger productId;

	public BigInteger getProductId() {
		return productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public BigInteger getLocationId() {
		return locationId;
	}

	public void setLocationId(BigInteger locationId) {
		this.locationId = locationId;
	}

}
