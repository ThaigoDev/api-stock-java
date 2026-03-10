package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.MovimentacaoEstoqueDTO.MovimentacaoEstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.MovimentacaoEstoqueDTO.MovimentacaoEstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.MovimentacaoEstoque;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperMovimentacaoEstoque {

    MovimentacaoEstoque dtoToEntity(MovimentacaoEstoqueRequisicaoDTO movimentacaoEstoqueRequisicaoDTO);
    MovimentacaoEstoqueRespostaDTO entityToDto(MovimentacaoEstoque movimentacaoEstoque);

}
