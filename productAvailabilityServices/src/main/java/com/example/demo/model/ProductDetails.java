package com.example.demo.model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product_details", schema = "sys")
@Entity
public class ProductDetails {

	@Id
	@Column(name = "product_id")
	private BigInteger productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_description")
	private String productDesc;
	@Column(name = "product_sku")
	private String productSku;
	@Column(name = "product_online")
	private Boolean productOnline;

	public BigInteger getProductId() {
		return productId;
	}

	public void setProductId(BigInteger productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName (String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc (String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductSku() {
		return productSku;
	}

	public void setProductSku (String productSku) {
		this.productSku = productSku;
	}

	public boolean isProductOnline() {
		return productOnline;
	}

	public void setProductOnline (boolean productOnline) {
		this.productOnline = productOnline;
	}
	

}
