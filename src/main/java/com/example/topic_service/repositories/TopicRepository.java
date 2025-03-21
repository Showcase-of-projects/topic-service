package com.example.topic_service.repositories;

import com.example.topic_service.entities.TopicEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TopicRepository extends GeneralRepository<TopicEntity, Long>, JpaSpecificationExecutor<TopicEntity> {
}
