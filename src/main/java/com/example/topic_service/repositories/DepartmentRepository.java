package com.example.topic_service.repositories;

import com.example.topic_service.entities.DepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends GeneralRepository<DepartmentEntity, Long> {
}
