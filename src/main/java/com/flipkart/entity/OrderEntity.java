package com.flipkart.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertable")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String city;
	private int pincode;

	@OneToMany(targetEntity = ProductEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fkey", referencedColumnName = "id")
	
	private List<ProductEntity> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

}
