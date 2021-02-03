package com.example.demo.service.mapper;

import com.example.demo.entitites.SaleEntity;
import com.example.demo.service.dto.SaleDTO;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface SaleMapper extends EntityMapper<SaleDTO, SaleEntity> {
}