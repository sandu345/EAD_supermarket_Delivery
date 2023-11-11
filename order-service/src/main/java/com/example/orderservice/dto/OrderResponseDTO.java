package com.example.orderservice.dto;

import lombok.*;

import java.util.List;

import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class OrderResponseDTO {
    private int id;
    private int customerId;
    private String address;
    private double total;
    private List<OrderItemDTO> items;
}
