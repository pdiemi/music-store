package com.example.model;

import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@DiscriminatorValue("customer")
public class Customer extends User{
	@Column(name = "user_fullname")
	private String customerName;
	@Column(name = "user_phone_number")
	private String customerPhoneNumber;
	@Column(name = "userstreet_address")
	private String customerStreetAddress;
	@Column(name = "user_city")
	private String customerCity;
	@Column(name = "user_state")
	private String customerState;
	@Column(name = "user_country")
	private String customerCountry;
	@Column(name = "user_zipcode")
	private String customerZipcode;
	@Column(name = "user_status")
	private String customerStatus;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> orders;
	
	public Customer() {
		super();
		roles = new HashSet<>();
		roles.add(new Role(2,"customer"));
	}
}
