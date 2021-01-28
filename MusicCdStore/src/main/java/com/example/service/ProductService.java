package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public List<Product> getAllProducts(){
		return productDao.findAll();
	}
	
	public Product getProductById(long productId) {
		return productDao.findById(productId).get();
	}
	
	public List<Product> getProductByCategory(String productCategory){
		return productDao.findAllByProductCategory(productCategory);
	}
	
	public Product addProduct(Product product) {
		return productDao.save(product);
	}
	
	public Product updateProduct(Product product) {
		productDao.delete(product);
		return productDao.save(product);
	}
	
	public void deleteProduct(Product product) {
		productDao.delete(product);
	}
}
