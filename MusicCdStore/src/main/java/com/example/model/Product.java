package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_image")
	private String productImage;
	@Column(name = "product_category")
	private String productCategory;
	@Column(name = "product_condition")
	private String productCondition;
	@Column(name = "product_manufacture")
	private String productManufacture;
	@Column(name = "product_genre")
	private String productGenre;
	@Column(name = "product_price")
	private double productPrice;
	@Column(name = "product_description")
	private String productDescription;
	
	@OneToMany(mappedBy = "product")
	private List<OrderDetail> orderDetails;
	
}
