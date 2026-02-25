package com.thai.finance.api.finance.api.domain.dtos.productDTO;

import java.util.UUID;

public record UpdateProductDTO(
        String nameProduct,
        String skuProduct,
        Integer minimum_stock,
        UUID categoryId,
        UUID supplier,
        UUID stock,
        Integer initialStock,
        Boolean active
) {
}
