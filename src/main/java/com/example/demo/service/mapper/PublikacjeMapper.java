package com.example.demo.service.mapper;

import com.example.demo.entitites.PublikacjeEntity;
import com.example.demo.service.dto.PublikacjeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublikacjeMapper extends EntityMapper<PublikacjeDTO, PublikacjeEntity> {
}