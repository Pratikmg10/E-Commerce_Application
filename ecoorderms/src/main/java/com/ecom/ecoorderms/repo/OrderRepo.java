package com.ecom.ecoorderms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecom.ecoorderms.entity.Order;
import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    List<Order> findByUserId(int userId);
}