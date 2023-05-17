package com.ecommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Ecommerce.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
