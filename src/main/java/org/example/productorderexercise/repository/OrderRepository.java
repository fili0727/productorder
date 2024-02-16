package org.example.productorderexercise.repository;

import org.example.productorderexercise.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
