package com.ecommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
