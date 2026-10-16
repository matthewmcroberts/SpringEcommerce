package com.matthewmcroberts.springecom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
