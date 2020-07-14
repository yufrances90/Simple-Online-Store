package com.simpleonlinestore.orderservice.repositories;

import com.simpleonlinestore.orderservice.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
