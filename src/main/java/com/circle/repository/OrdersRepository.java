package com.circle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.domain.Orders;


public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
