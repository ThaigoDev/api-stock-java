package com.thai.finance.api.finance.api.respository;

import com.thai.finance.api.finance.api.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository  extends JpaRepository<Category, UUID> {
}
