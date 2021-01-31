package com.example.model;

import java.util.HashSet;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@DiscriminatorValue("admin")
@Data
public class Admin extends User{

	public Admin() {
		super();
		roles = new HashSet<>();
		roles.add(new Role(1,"admin"));
	}
}
