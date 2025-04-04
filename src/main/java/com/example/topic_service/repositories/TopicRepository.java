package com.example.topic_service.repositories;

import com.example.topic_service.entities.TopicEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends GeneralRepository<TopicEntity, Long>, JpaSpecificationExecutor<TopicEntity> {
}
