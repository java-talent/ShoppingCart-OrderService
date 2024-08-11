package com.javatalent.orderservice.service;

import com.javatalent.orderservice.Payload.OrderRequest;
import com.javatalent.orderservice.Payload.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}