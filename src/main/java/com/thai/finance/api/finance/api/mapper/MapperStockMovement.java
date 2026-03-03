package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO.CreateStockMovementDTO;
import com.thai.finance.api.finance.api.domain.dtos.stockMovementDTO.ResponseMovementStockDTO;
import com.thai.finance.api.finance.api.domain.entities.Stock_Movement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperStockMovement {

    Stock_Movement dtoToEntity(CreateStockMovementDTO createStockMovementDTO);
    ResponseMovementStockDTO entityToDto(Stock_Movement stockMovement);

}
