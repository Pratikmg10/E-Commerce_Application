package com.ecom.ecoorderms.service;

import com.ecom.ecoorderms.entity.Cart;

public interface CartService {
    Cart addProductToCart(int userId, int productId, int qty);
    void deleteProductFromCart(int cartId);
    Cart updateProductQty(int userId, int productId, int qty);
    Cart viewCart(int userId);
}