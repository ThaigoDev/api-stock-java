package com.thai.finance.api.finance.api.domain.dtos.MovimentacaoEstoqueDTO;

import com.thai.finance.api.finance.api.domain.enums.MovementType;

import java.util.UUID;

public record MovimentacaoEstoqueRespostaDTO(UUID id, UUID productId, MovementType type, Integer quantity) {
}
