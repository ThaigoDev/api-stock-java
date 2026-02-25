package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.stockDTO.CreateStockDTO;
import com.thai.finance.api.finance.api.domain.dtos.stockDTO.ResponseStockDTO;
import com.thai.finance.api.finance.api.domain.entities.Stock;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public ResponseStockDTO entityToResponseDTO(Stock stock) {
        ResponseStockDTO  entityConvertedToDto = new ResponseStockDTO(stock.getId(), stock.getProduct().getId(),stock.getProduct().getNameProduct() ,stock.getQuantityProduct());
        return entityConvertedToDto;
    };
    public Stock createStockDTOtoEntity (CreateStockDTO createStockDTO) {
        Stock dtoConvertedToEntity = new Stock(null,createStockDTO.product() ,createStockDTO.quantityProduct());
        return dtoConvertedToEntity;
    };
}

