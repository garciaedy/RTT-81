package com.garcia.abcincproject.daointeface;

import java.util.List;
import com.garcia.abcincproject.model.Order;

public interface OrderDao {
    List<Order> getAllOrders();
}