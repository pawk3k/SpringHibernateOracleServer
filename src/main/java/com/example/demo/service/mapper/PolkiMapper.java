package com.example.demo.service.mapper;

import com.example.demo.entitites.PolkiEntity;
import com.example.demo.service.dto.PolkiDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PolkiMapper extends EntityMapper<PolkiDTO, PolkiEntity> {
}