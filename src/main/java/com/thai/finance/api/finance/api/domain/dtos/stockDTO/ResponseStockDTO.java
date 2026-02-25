package com.thai.finance.api.finance.api.domain.dtos.stockDTO;

import java.util.UUID;

public record ResponseStockDTO( UUID id , UUID product,String productName, Integer quantityProduct) {
}
