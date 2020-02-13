package com.sweetsalt.services.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer id;
    private String status;
    private List<OrderItem> orderItems;
    private BigDecimal price;
}
