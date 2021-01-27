package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

	public List<Product> findAllByProductCategory(@Param("productCategory") String productCategory);
}
