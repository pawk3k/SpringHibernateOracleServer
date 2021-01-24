package com.example.demo.service.mapper;

import com.example.demo.entitites.UzytkownicyEntity;
import com.example.demo.service.dto.UzytkownicyDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UzytkownicyMapper extends EntityMapper<UzytkownicyDTO, UzytkownicyEntity> {
}