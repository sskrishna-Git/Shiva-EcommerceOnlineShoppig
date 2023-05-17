package com.ecommerce.Ecommerce.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmailIdAndPasswordAndRole(String emailId, String password, String role);
	List<User> findByRole(String role);

}
