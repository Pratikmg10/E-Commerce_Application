package com.ecom.ecoorderms.service;

import java.util.List;
import com.ecom.ecoorderms.entity.Order;

public interface OrderService {
    Order createOrder(int userId);
    Order cancelOrder(int orderId);
    List<Order> getAllOrders();
    List<Order> getOrdersByUser(int userId);
    Order getOrderById(int orderId);
    Order updateOrderStatus(int orderId, String status);
}