package com.thai.finance.api.finance.api.controllers;

import com.thai.finance.api.finance.api.domain.dtos.stockDTO.CreateStockDTO;
import com.thai.finance.api.finance.api.domain.dtos.stockDTO.ResponseStockDTO;
import com.thai.finance.api.finance.api.services.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping
    public ResponseEntity<List<ResponseStockDTO>> getAllStocks () {
        var allStocks = stockService.getAllStocks();
        return ResponseEntity.ok(allStocks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseStockDTO> getStockById(@PathVariable("id") UUID stockId) {
        var stock = stockService.getStockById(stockId);
        return  ResponseEntity.ok(stock);
    };
}
