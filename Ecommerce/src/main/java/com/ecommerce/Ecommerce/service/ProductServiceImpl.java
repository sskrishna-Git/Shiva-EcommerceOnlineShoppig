package com.ecommerce.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.Ecommerce.Entity.Product;
import com.ecommerce.Ecommerce.Repository.ProductRepository;
import com.ecommerce.Ecommerce.utility.StorageService;


@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StorageService storageService;

	@Override
	public void addProduct(Product product, MultipartFile productImmage) {
		// TODO Auto-generated method stub
		String productImageName = storageService.store(productImmage);
		
		product.setImageName(productImageName);
		
		this.productRepository.save(product);
		
	}

	
}
