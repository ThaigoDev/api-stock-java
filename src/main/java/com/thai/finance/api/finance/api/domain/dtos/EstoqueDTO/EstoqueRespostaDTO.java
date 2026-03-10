package com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO;

import java.util.UUID;

public record EstoqueRespostaDTO(UUID id , UUID produto, Integer quantidade) {
}
