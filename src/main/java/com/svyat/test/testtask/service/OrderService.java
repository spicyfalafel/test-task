package com.svyat.test.testtask.service;


import com.svyat.test.testtask.models.Order;

import java.util.List;

public interface OrderService {

    Order getById(Long id);

    void save(Order order);

    void saveAll(List<Order> orders);

    void delete(Long id);

    List<Order> getAll();

}
