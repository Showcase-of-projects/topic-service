package com.example.topic_service.config;

import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.entities.TopicEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(TopicEntity.class, TopicDTO.class)
                .addMappings(mapper -> mapper.map(TopicEntity::getTypeEntity, TopicDTO::setTypeDTO))
                .addMappings(mapper -> mapper.map(TopicEntity::getDepartmentEntity, TopicDTO::setDepartmentDTO));
        return modelMapper;
    }
}
