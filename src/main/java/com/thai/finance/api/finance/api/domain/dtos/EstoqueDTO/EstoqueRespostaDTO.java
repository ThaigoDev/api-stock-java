package com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO;

import java.util.UUID;

public record ResponseStockDTO( UUID id , UUID produto, Integer quantidade) {
}
