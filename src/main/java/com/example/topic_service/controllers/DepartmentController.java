package com.example.topic_service.controllers;

import com.example.topic_service.dtos.DepartmentDTO;
import com.example.topic_service.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<DepartmentDTO>> getAll() {
        List<DepartmentDTO> departmentDTOS = departmentService.getAll();
        return ResponseEntity.ok(departmentDTOS);
    }
}
