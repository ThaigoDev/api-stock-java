package com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO;

import com.thai.finance.api.finance.api.domain.enums.MovementType;

import java.time.Instant;
import java.util.UUID;

public record UpdateMovementStockDTO(UUID productId, MovementType type, Integer quantity, Instant updateAt) {
}
