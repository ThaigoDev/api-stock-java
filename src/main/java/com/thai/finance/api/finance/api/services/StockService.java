package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.dtos.stockDTO.CreateStockDTO;
import com.thai.finance.api.finance.api.dtos.stockDTO.ResponseStockDTO;
import com.thai.finance.api.finance.api.mapper.StockMapper;
import com.thai.finance.api.finance.api.respository.StockRespository;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    private final StockRespository stockRepository;
    private final StockMapper stockMapper;
    public StockService(StockRespository stockRespository, StockMapper stockMapper) {
        this.stockRepository = stockRespository;
        this.stockMapper = stockMapper;
    }

    public ResponseStockDTO createStock(CreateStockDTO createStockDTO) {
      return   stockMapper.entityToResponseDTO(stockRepository.save(stockMapper.createStockDTOtoEntity(createStockDTO)));
    }
}
