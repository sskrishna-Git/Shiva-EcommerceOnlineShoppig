package com.ecommerce.Ecommerce.service;

import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.Ecommerce.Entity.Product;



public interface ProductService {

	void addProduct(Product product, MultipartFile productImmage);
}
