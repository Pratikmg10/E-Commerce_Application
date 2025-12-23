package com.ecom.ecoorderms.repo;

import com.ecom.ecoorderms.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CartRepo extends JpaRepository<Cart, Integer> {
    Optional<Cart> findByUserId(int userId);
}