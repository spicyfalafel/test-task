package com.svyat.test.testtask.service;

import com.svyat.test.testtask.models.Order;
import com.svyat.test.testtask.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImplementation implements OrderService{

    @Autowired
    OrderRepository orderRepository;


    @Override
    public Order getById(Long id) {
        log.info("getById():" + id);
        return orderRepository.getOne(id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
        log.info("save():" + order);
    }

    @Override
    public void saveAll(List<Order> orders) {
        orderRepository.saveAll(orders);
        log.info("saveAll(): " + orders.size());
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
        log.info("delete():" + id);
    }

    @Override
    public List<Order> getAll() {
        log.info("getAll()");
        return orderRepository.findAll();
    }
}
