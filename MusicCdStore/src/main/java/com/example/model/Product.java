package com.example.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_image")
	private String productImage;
	@Column(name = "category_id")
	private int productCategory;
	@Column(name = "condition_id")
	private int productCondition;
	@Column(name = "manufacture_id")
	private int productManufacture;
	@Column(name = "genre_id")
	private int productGenre;
	@Column(name = "product_price")
	private double productPrice;
	@Column(name = "product_description")
	private String productDescription;
}
