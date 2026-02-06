package com.thai.finance.api.finance.api.controllers;

import com.thai.finance.api.finance.api.dtos.stockDTO.CreateStockDTO;
import com.thai.finance.api.finance.api.dtos.stockDTO.ResponseStockDTO;
import com.thai.finance.api.finance.api.services.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/stock")
public class StockController {
    private StockService stockService;
    public StockController (StockService stockService) {
        this.stockService = stockService;
    }
    @PostMapping
    public ResponseEntity<ResponseStockDTO> createStock(@RequestBody CreateStockDTO createStockDTO) {
      var stockCreated = stockService.createStock(createStockDTO);
      return ResponseEntity.ok(stockCreated);
    };
}
