package com.example.topic_service.controllers;

import com.example.topic_service.dtos.TypeDTO;
import com.example.topic_service.services.TypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<TypeDTO>> getAll() {
        List<TypeDTO> typeDTOS = typeService.getAll();
        return ResponseEntity.ok(typeDTOS);
    }
}
