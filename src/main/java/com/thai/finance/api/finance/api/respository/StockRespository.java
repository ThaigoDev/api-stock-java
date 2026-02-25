package com.thai.finance.api.finance.api.respository;

import com.thai.finance.api.finance.api.domain.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface StockRespository  extends JpaRepository<Stock, UUID> {
    Optional<Stock> findByProduct_Id(UUID productId);
}
