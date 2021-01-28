package com.example.demo.service.mapper;

import com.example.demo.entitites.RegalyEntity;
import com.example.demo.service.dto.RegalyDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegalyMapper extends EntityMapper<RegalyDTO, RegalyEntity> {
}