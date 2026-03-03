package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.categoryDTO.CreateCategoryDTO;
import com.thai.finance.api.finance.api.domain.dtos.categoryDTO.ResponseCategoryDTO;
import com.thai.finance.api.finance.api.domain.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperCategory {
    Category dtoToEntity (CreateCategoryDTO createCategoryDTO);
    ResponseCategoryDTO entityToDTO (Category category);
}
