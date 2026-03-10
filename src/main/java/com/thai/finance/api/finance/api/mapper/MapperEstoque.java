package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Estoque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperEstoque {
    @Mapping(target = "produto.id", source = "produto")
    Estoque paraEntidade(EstoqueRequisicaoDTO estoqueRequisicaoDTO);

    @Mapping(target = "produto", source = "produto.id")
    EstoqueRespostaDTO paraDTO(Estoque estoque);
}
