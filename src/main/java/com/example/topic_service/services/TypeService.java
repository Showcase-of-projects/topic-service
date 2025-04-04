package com.example.topic_service.services;

import com.example.topic_service.dtos.TypeDTO;
import com.example.topic_service.repositories.TypeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    private final TypeRepository typeRepository;
    private final ModelMapper modelMapper;

    public TypeService(TypeRepository typeRepository, ModelMapper modelMapper) {
        this.typeRepository = typeRepository;
        this.modelMapper = modelMapper;
    }

    public List<TypeDTO> getAll() {
        List<TypeDTO> typeDTOS = typeRepository.findAll()
                .stream().map(typeEntity -> modelMapper.map(typeEntity, TypeDTO.class)).toList();
        return typeDTOS;
    }


}
