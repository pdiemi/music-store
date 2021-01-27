package com.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@DiscriminatorValue("admin")
@Data
@AllArgsConstructor
public class Admin extends User{

}
