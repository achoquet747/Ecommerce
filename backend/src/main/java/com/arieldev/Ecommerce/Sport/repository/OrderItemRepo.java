package com.arieldev.Ecommerce.Sport.repository;

import com.arieldev.Ecommerce.Sport.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>, JpaSpecificationExecutor<OrderItem> {


}