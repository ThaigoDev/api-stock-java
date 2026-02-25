package com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO;

import com.thai.finance.api.finance.api.domain.enums.MovementType;

import java.util.UUID;

public record CreateStockMovementDTO( UUID productId, MovementType type, Integer quantity) {
}
