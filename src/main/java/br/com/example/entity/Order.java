package br.com.example.entity;

import br.com.example.resource.request.OrderDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Pedido")
@Data
@NoArgsConstructor
public class Order implements Serializable {

    public Order(OrderDTO orderDTO) {
        this.code = orderDTO.getCode();
        this.total = orderDTO.getTotal();
        this.description = orderDTO.getDescription();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private BigDecimal total;

    @Column
    private String description;

}
