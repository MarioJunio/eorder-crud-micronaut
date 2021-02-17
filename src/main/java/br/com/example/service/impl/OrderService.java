package br.com.example.service.impl;

import br.com.example.entity.Order;
import br.com.example.repository.OrderRepository;
import br.com.example.resource.request.OrderDTO;
import br.com.example.service.IOrderService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;

@Singleton
@Transactional
public class OrderService implements IOrderService {

    @Inject
    private OrderRepository orderRepository;

    @Override
    public List<Order> readAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(OrderDTO orderDTO) {
        return orderRepository.save(new Order(orderDTO));
    }

    @Override
    public Order update(Long id, OrderDTO orderDTO) {
        Order order = new Order(orderDTO);
        order.setId(id);

        return orderRepository.update(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
