package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.dtos.CreateProductDTO;
import com.thai.finance.api.finance.api.entities.Product;
import com.thai.finance.api.finance.api.respository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(CreateProductDTO createProductDTO) {
        var productEntity  = new Product(
                createProductDTO.id(),
                createProductDTO.nameProduct(),
                createProductDTO.skuProduct(),
                createProductDTO.minimum_stock(),
                createProductDTO.categoryId(),
                createProductDTO.supplier(),
                createProductDTO.stock(),
                true,
                Instant.now(),
                null
        );
       productRepository.save(productEntity);
    }
}
