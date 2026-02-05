package com.thai.finance.api.finance.api.controllers;

import com.thai.finance.api.finance.api.dtos.stockDTO.CreateStockDTO;
import com.thai.finance.api.finance.api.dtos.stockDTO.ResponseStockDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/stock")
public class StockController {
    @PostMapping
    public ResponseEntity<ResponseStockDTO> createStock(@RequestBody CreateStockDTO createStockDTO) {

    };
}
