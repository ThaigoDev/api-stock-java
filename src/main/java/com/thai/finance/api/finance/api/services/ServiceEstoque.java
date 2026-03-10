package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRespostaDTO;
import com.thai.finance.api.finance.api.mapper.MapperEstoque;
import com.thai.finance.api.finance.api.respository.RepositoryEstoque;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceEstoque {
    private final RepositoryEstoque stockRepository;
    private final MapperEstoque mapper;

    public EstoqueRespostaDTO salvar(EstoqueRequisicaoDTO estoqueRequisicaoDTO) {
        return mapper.paraDTO(stockRepository.save(mapper.paraEntidade(estoqueRequisicaoDTO)));
    }

    public List<EstoqueRespostaDTO> obter() {
        return stockRepository.findAll().stream().map(mapper::paraDTO).toList();
    }

    public EstoqueRespostaDTO obterPorId(UUID estoque_id) {
        return mapper.paraDTO(stockRepository.findById(estoque_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estoque não encontrado")));
    }
}
