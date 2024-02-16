package org.example.productorderexercise.repository;

import org.example.productorderexercise.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
