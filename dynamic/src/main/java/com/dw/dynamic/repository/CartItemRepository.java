package com.dw.dynamic.repository;

import com.dw.dynamic.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository <Product, String> {
}