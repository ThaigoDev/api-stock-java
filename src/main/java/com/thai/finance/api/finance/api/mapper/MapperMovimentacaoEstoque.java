package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.entities.MovimentacaoEstoque;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperMovimentacaoEstoque {

    MovimentacaoEstoque dtoToEntity(MovimentacaoEstoque movimentacaoEstoqueRequisicaoDTO);
    MovimentacaoEstoque entityToDto(MovimentacaoEstoque stockMovement);

}
