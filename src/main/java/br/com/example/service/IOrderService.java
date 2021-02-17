package br.com.example.service;

import br.com.example.entity.Order;
import br.com.example.resource.request.OrderDTO;

import java.util.List;

public interface IOrderService {

    List<Order> readAll();

    Order save(OrderDTO orderDTO);

    Order update(Long id, OrderDTO orderDTO);

    void delete(Long id);
}
