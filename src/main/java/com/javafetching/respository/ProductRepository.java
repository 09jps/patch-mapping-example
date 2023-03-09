package com.javafetching.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javafetching.entity.Product;

public interface ProductRepository extends
        JpaRepository<Product, Integer> {


}
