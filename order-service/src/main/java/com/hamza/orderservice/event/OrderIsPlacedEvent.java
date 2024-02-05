package com.hamza.orderservice.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderIsPlacedEvent {
    private String orderNumber;
}
