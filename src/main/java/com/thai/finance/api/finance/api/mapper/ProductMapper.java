package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.productDTO.ResponseProductDTO;
import com.thai.finance.api.finance.api.domain.entities.Product;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductMapper {
    public  ResponseProductDTO EntityResponseToDTO (Product product) {
         UUID stockId = null;
         Integer stockQuantity = null;

         if(product.getStock()!= null) {
             stockId = product.getStock().getId();
             stockQuantity= product.getStock().getQuantityProduct();
         }

        ResponseProductDTO entityConverted =  new ResponseProductDTO(product.getId(),product.getNameProduct(), product.getSkuProduct(), product.getMinimum_stock(), product.getCategoryId().getId(), product.getSupplier().getId(),stockId,stockQuantity, product.getInitialStock(), product.isActive());
        return  entityConverted;

    };

}
