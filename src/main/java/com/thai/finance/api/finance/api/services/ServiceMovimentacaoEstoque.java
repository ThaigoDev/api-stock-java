package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO.ResponseMovementStockDTO;
import com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO.UpdateMovementStockDTO;
import com.thai.finance.api.finance.api.domain.entities.Produto;
import com.thai.finance.api.finance.api.domain.entities.Estoque;
import com.thai.finance.api.finance.api.domain.entities.MovimentacaoEstoque;
import com.thai.finance.api.finance.api.domain.enums.MovementType;
import com.thai.finance.api.finance.api.mapper.MapperMovimentacaoEstoque;
import com.thai.finance.api.finance.api.mapper.StockMovementMapper;
import com.thai.finance.api.finance.api.respository.RepositoryProduto;
import com.thai.finance.api.finance.api.respository.RepositoryMovimentacaoEstoque;
import com.thai.finance.api.finance.api.respository.RepositoryEstoque;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceMovimentacaoEstoque {
    private final RepositoryMovimentacaoEstoque repositoryMovimentacaoEstoque;
    private final StockMovementMapper stockMovementMapper;
    private final RepositoryProduto repositoryProduto;
    private final RepositoryEstoque repositoryEstoque;
    private final MapperMovimentacaoEstoque mapper;

    public ResponseMovementStockDTO createStockMovement(com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO.MovimentacaoEstoqueRequisicaoDTO movimentacaoEstoqueRequisicaoDTO) {
        if (movimentacaoEstoqueRequisicaoDTO.productId() == null) {
            throw new IllegalArgumentException("priductId is obrigatory");
        }

        Produto produtoFinded = repositoryProduto.findById(movimentacaoEstoqueRequisicaoDTO.productId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product Not Found"));
        MovimentacaoEstoque stockMovementConverted = mapper.dtoToEntity(movimentacaoEstoqueRequisicaoDTO);

        Estoque estoqueFinded = repositoryEstoque.findByProduct_Id(produtoFinded.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Stock Not Found"));

        if (movimentacaoEstoqueRequisicaoDTO.type() == MovementType.OUT) {
            if (movimentacaoEstoqueRequisicaoDTO.quantity() >= produtoFinded.getMinimum_stock()) {
                throw new IllegalArgumentException("not authorized the transaction");
            }

            produtoFinded.setInitialStock(produtoFinded.getInitialStock() - movimentacaoEstoqueRequisicaoDTO.quantity());
            estoqueFinded.setQuantityProduct(estoqueFinded.getQuantityProduct() - movimentacaoEstoqueRequisicaoDTO.quantity());
        } else {
            produtoFinded.setInitialStock(produtoFinded.getInitialStock() + movimentacaoEstoqueRequisicaoDTO.quantity());
            estoqueFinded.setQuantityProduct(estoqueFinded.getQuantityProduct() + movimentacaoEstoqueRequisicaoDTO.quantity());
        }
        repositoryProduto.save(produtoFinded);
        repositoryEstoque.save(estoqueFinded);

        stockMovementConverted.setProduto(produtoFinded);
        return mapper.entityToDto(repositoryMovimentacaoEstoque.save(stockMovementConverted));
    }

    public List<ResponseMovementStockDTO> allStockMovements() {
        return repositoryMovimentacaoEstoque.findAll().stream().map(mapper::entityToDto).toList();
    }

    public void deleteStockMovementById(UUID stockMovementId) {
        repositoryMovimentacaoEstoque.deleteById(stockMovementId);
    }

    public ResponseMovementStockDTO updateStockMovement(UUID id, UpdateMovementStockDTO updateMovementStockDTO) {
        MovimentacaoEstoque stockMovementExist = repositoryMovimentacaoEstoque.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Stock Movement not found"));
        Produto produtoFinded = repositoryProduto.findById(updateMovementStockDTO.productId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Prodcut Not found"));
        Estoque estoqueFinded = repositoryEstoque.findByProduct_Id(produtoFinded.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Stock not found"));

        if (updateMovementStockDTO.type() == MovementType.OUT) {
            if (updateMovementStockDTO.quantity() >= produtoFinded.getMinimum_stock()) {
                throw new IllegalArgumentException("not authorized the transaction");
            }
            produtoFinded.setInitialStock(produtoFinded.getInitialStock() - updateMovementStockDTO.quantity());
            estoqueFinded.setQuantityProduct(estoqueFinded.getQuantityProduct() - updateMovementStockDTO.quantity());
        } else {
            produtoFinded.setInitialStock(produtoFinded.getInitialStock() + updateMovementStockDTO.quantity());
            estoqueFinded.setQuantityProduct(estoqueFinded.getQuantityProduct() + updateMovementStockDTO.quantity());
        }


        stockMovementExist.setProduto(produtoFinded);
        stockMovementExist.setType(updateMovementStockDTO.type());
        stockMovementExist.setQuantityMovement(updateMovementStockDTO.quantity());
        stockMovementExist.setUpdateAt(Instant.now());

        repositoryProduto.save(produtoFinded);
        repositoryEstoque.save(estoqueFinded);

        return mapper.entityToDto(repositoryMovimentacaoEstoque.save(stockMovementExist));
    }
}
