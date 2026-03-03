package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.productDTO.CreateProductDTO;
import com.thai.finance.api.finance.api.domain.dtos.productDTO.ResponseProductDTO;
import com.thai.finance.api.finance.api.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperProduct {
 Product dtoToEntity(CreateProductDTO createProductDTO);
 ResponseProductDTO entityToDTO(Product product);
}
