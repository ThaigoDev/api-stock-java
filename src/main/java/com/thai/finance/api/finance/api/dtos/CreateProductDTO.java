package com.thai.finance.api.finance.api.dtos;

import com.thai.finance.api.finance.api.entities.Category;
import com.thai.finance.api.finance.api.entities.Stock;
import com.thai.finance.api.finance.api.entities.Supplier;

import java.util.UUID;

public record CreateProductDTO(UUID id, String nameProduct, String skuProduct, Integer minimum_stock, Category categoryId, Supplier supplier, Stock stock) {
}
