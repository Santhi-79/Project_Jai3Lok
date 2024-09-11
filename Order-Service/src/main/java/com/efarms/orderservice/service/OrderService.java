package com.efarms.orderservice.service;

import java.util.List;

import com.efarms.orderservice.entity.Order;

public interface OrderService {
	
	Order createOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    List<Order> getOrdersByStatus(String status);

}
