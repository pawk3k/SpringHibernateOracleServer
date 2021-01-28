package com.example.demo.service.mapper;

import com.example.demo.entitites.EgzemplarzeEntity;
import com.example.demo.service.dto.EgzemplarzeDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EgzemplarzeMapper extends EntityMapper<EgzemplarzeDTO, EgzemplarzeEntity> {
}