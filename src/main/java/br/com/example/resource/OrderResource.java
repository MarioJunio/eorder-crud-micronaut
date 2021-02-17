package br.com.example.resource;

import br.com.example.entity.Order;
import br.com.example.resource.request.OrderDTO;
import br.com.example.service.IOrderService;
import io.micronaut.http.annotation.*;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.util.List;

@Controller("/orders")
@Slf4j
public class OrderResource {

    @Inject
    private IOrderService orderService;

    @Get
    public List<Order> getOrders() {
        return orderService.readAll();
    }

    @Post
    public Order createOrder(@Body OrderDTO orderDTO) {
        return orderService.save(orderDTO);
    }

    @Put("/{id}")
    public Order updateOrder(@PathVariable Long id, @Body OrderDTO orderDTO) {
        return orderService.update(id, orderDTO);
    }

    @Delete("/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }
}
