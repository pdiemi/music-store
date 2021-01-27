package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@IdClass(OrderDetailId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

	@Id
	@ManyToOne
	@JoinColumn(name = "order_number")
	private Orders order;
	@Id
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@Column(name = "quantity")
	@NotNull
	private int productQuantity;
}
