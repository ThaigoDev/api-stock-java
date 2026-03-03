package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.domain.dtos.categoryDTO.CreateCategoryDTO;
import com.thai.finance.api.finance.api.domain.dtos.categoryDTO.ResponseCategoryDTO;
import com.thai.finance.api.finance.api.domain.entities.Category;
import com.thai.finance.api.finance.api.mapper.CategoryMapper;
import com.thai.finance.api.finance.api.mapper.MapperCategory;
import com.thai.finance.api.finance.api.respository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final MapperCategory mapper;


    public ResponseCategoryDTO createCategory(CreateCategoryDTO createCategoryDTO) {

        return mapper.entityToDTO(categoryRepository.save(mapper.dtoToEntity(createCategoryDTO)));


    }

    public List<ResponseCategoryDTO> getAllCategories() {
        return categoryRepository
                .findAll()
                .stream()
                .map(mapper::entityToDTO)
                .toList();
    }

    public void deleteCategoryById(UUID id) {
        var categoryExist = categoryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        categoryRepository.deleteById(categoryExist.getId());

    }
}
