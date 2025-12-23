package com.ecom.ecoproductms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecoproductms.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}