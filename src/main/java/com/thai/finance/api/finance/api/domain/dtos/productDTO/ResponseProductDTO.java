package com.thai.finance.api.finance.api.domain.dtos.productDTO;

import java.util.UUID;

public record ResponseProductDTO(
        UUID id,
        String nameProduct,
        String skuProduct,
        Integer minimum_stock,
        UUID categoryId,
        UUID supplierId,
        UUID stock,
        Integer stockQuantity,
        Integer initialStock,
        Boolean active
) {
}
