package com.thai.finance.api.finance.api.dtos.stockDTO;

import com.thai.finance.api.finance.api.entities.Product;

import java.util.UUID;

public record CreateStockDTO(Product product, Integer quantityProduct) {
}
