package com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO;

import com.thai.finance.api.finance.api.domain.entities.Produto;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record EstoqueRequisicaoDTO(
        @NotNull(message = "the propriety 'product' cannot be null ")
        UUID produto,
        @NotNull(message = "the propriety 'quantity' cannot be null ")
        Integer quantityProduct) {
}
