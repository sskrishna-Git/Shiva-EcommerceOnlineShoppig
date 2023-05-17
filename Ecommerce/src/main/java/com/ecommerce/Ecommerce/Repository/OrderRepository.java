package com.ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.Orders;
import com.ecommerce.Ecommerce.Entity.User;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

	List<Orders> findByUser_id(int userId);
	List<Orders> findByOrderId(String orderId);
	List<Orders> findByUser_idAndProduct_id(int userId, int productId);
	List<Orders> findByUser(User user);
	List<Orders> findByDeliveryPersonId(int deliveryPersonId);
	
}
