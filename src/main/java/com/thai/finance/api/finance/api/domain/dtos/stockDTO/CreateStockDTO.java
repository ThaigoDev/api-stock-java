package com.thai.finance.api.finance.api.domain.dtos.stockDTO;

import com.thai.finance.api.finance.api.domain.entities.Product;

public record CreateStockDTO(Product product, Integer quantityProduct) {
}
