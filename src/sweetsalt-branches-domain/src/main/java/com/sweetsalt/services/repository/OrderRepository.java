package com.sweetsalt.services.repository;

import com.sweetsalt.services.model.Order;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(Integer id);
    void save (Order order);
}
