package com.thai.finance.api.finance.api.respository;

import com.thai.finance.api.finance.api.domain.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<Supplier, UUID> {
}
