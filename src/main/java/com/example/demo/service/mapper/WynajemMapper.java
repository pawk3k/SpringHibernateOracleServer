package com.example.demo.service.mapper;

import com.example.demo.entitites.WynajemEntity;
import com.example.demo.service.dto.WynajemDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WynajemMapper extends EntityMapper<WynajemDTO, WynajemEntity> {
}