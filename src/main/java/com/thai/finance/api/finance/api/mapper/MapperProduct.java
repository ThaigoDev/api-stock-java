package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.productDTO.CreateProductDTO;
import com.thai.finance.api.finance.api.domain.dtos.productDTO.ResponseProductDTO;
import com.thai.finance.api.finance.api.domain.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperProduct {

 @Mapping(target = "categoryId.id" , source = "categoryId")
 @Mapping(target = "supplier.id" , source = "supplierId")
 @Mapping(target = "stock.id" , source = "stock")
 Product dtoToEntity(CreateProductDTO createProductDTO);

 @Mapping(target = "categoryId", source = "categoryId.id")
 @Mapping(target = "supplierId", source = "supplier.id")
 @Mapping(target = "stock", source = "stock.id")
 ResponseProductDTO entityToDTO(Product product);
}
