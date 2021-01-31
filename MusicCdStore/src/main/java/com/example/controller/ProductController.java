package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Customer;
import com.example.model.Product;
import com.example.model.Role;
import com.example.model.User;
import com.example.service.CustomerService;
import com.example.service.ProductService;
import com.example.service.UserService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private UserService userService;
	

	@RequestMapping(value = { "/products/all", "/products/all/user={username}" }, method = RequestMethod.GET)
	public ModelAndView getAllProducts() {
		List<Product> productList = productService.getAllProducts();
		return new ModelAndView("products", "productList", productList);
	}

	@GetMapping("/products/details/{productId}")
	public ModelAndView getProductById(@PathVariable long productId) {
		Product product = productService.getProductById(productId);
		return new ModelAndView("product-detail", "product", product);
	}

	@GetMapping("/products/{category}")
	public ModelAndView getProductsByCategory(@PathVariable String category) {
		List<Product> productList = productService.getProductByCategory(category);
		return new ModelAndView("products", "productList", productList);
	}

	@GetMapping("/admin/products/add")
	public ModelAndView addProduct() {
		Product product = new Product();
		ModelAndView mv = new ModelAndView("product-form");
		String itemChanged = "none";
		mv.addObject("itemChanged", itemChanged);
		mv.addObject("product", product);
		return mv;
	}

	@PostMapping("/admin/products/add")
	public ModelAndView addProduct(Product product) {
		productService.addProduct(product);
		ModelAndView mv = new ModelAndView("product-form");
		String itemChanged = "added";
		mv.addObject("itemChanged", itemChanged);
		return mv;
	}

	@GetMapping("/admin/products/update/{productId}")
	public ModelAndView updateProduct(@PathVariable long productId) {
		Product product = productService.getProductById(productId);
		ModelAndView mv = new ModelAndView("product-form");
		String itemChanged = "none";
		mv.addObject("itemChanged", itemChanged);
		mv.addObject("product", product);
		return mv;
	}

	@PostMapping("/admin/products/update/{productId}")
	public ModelAndView updateProduct(Product product) {
		productService.updateProduct(product);
		ModelAndView mv = new ModelAndView("admin-products");
		String itemChanged = "updated";
		mv.addObject("itemChanged", itemChanged);
		return mv;
	}

	@GetMapping("/admin/products/delete/{productId}")
	public ModelAndView deleteProduct(@PathVariable long productId) {
		Product product = productService.getProductById(productId);
		ModelAndView mv = new ModelAndView("product-form");
		String itemChanged = "none";
		mv.addObject("itemChanged", itemChanged);
		mv.addObject("product", product);
		return mv;
	}

	@PostMapping("/admin/products/delete/{productId}")
	public ModelAndView deleteProduct(Product product) {
		productService.deleteProduct(product);
		ModelAndView mv = new ModelAndView("admin-products");
		String itemChanged = "deleted";
		mv.addObject("itemChanged", itemChanged);
		return mv;
	}
}
