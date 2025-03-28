package com.ino.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDto {
    private int orderCode;
    private String orderDate;
    private String orderTime;
    private int totalOrderPrice;

    private List<OrderMenuDto> orderMenuDtoList;
}
