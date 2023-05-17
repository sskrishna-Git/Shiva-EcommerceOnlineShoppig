package com.ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.Cart;

public interface CarTRepository extends JpaRepository<Cart, Integer> {
	
	List<Cart> findByUser_id(int userId);

}
