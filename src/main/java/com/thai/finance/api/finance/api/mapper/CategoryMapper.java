package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.categoryDTO.ResponseCategoryDTO;
import com.thai.finance.api.finance.api.domain.entities.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public  ResponseCategoryDTO EntityResponseToDTO (Category category) {

        ResponseCategoryDTO entityConverted =  new ResponseCategoryDTO(category.getId(),category.getName());
        return  entityConverted;

    };
}
