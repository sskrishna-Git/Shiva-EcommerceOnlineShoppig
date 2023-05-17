package com.ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategoryId(int category);

}
