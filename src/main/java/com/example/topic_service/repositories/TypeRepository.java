package com.example.topic_service.repositories;

import com.example.topic_service.entities.TypeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends GeneralRepository<TypeEntity, Long> {
}
