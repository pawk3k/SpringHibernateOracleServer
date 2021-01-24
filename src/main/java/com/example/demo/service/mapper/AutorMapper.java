package com.example.demo.service.mapper;

import com.example.demo.entitites.AutorEntity;
import com.example.demo.service.dto.AutorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutorMapper extends EntityMapper<AutorDTO, AutorEntity> {
}