package com.example.topic_service.services;

import com.example.topic_service.dtos.DepartmentDTO;
import com.example.topic_service.repositories.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;

    public DepartmentService(DepartmentRepository departmentRepository, ModelMapper modelMapper) {
        this.departmentRepository = departmentRepository;
        this.modelMapper = modelMapper;
    }

    public List<DepartmentDTO> getAll() {
        List<DepartmentDTO> departmentDTOS = departmentRepository.findAll()
                .stream().map(departmentEntity -> modelMapper.map(departmentEntity, DepartmentDTO.class)).toList();
        return departmentDTOS;
    }
}
