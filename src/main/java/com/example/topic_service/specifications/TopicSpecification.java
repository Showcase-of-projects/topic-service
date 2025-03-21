package com.example.topic_service.specifications;

import com.example.topic_service.entities.TopicEntity;
import org.springframework.data.jpa.domain.Specification;

public class TopicSpecification {
    public static Specification<TopicEntity> hasName(String name) {
        return (root, query, criteriaBuilder) ->
            (name == null || name.isBlank()) ? null : criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<TopicEntity> hasDepartment(Long id) {
        return (root, query, criteriaBuilder) ->
                (id == null) ? null : criteriaBuilder.equal(root.get("departmentEntity").get("id"), id);
    }

    public static Specification<TopicEntity> hasType(Long id) {
        return (root, query, criteriaBuilder) ->
                (id == null) ? null : criteriaBuilder.equal(root.get("typeEntity").get("id"), id);
    }

    public static Specification<TopicEntity> notDeleted() {
        return (root, query, criteriaBuilder) -> criteriaBuilder.isFalse(root.get("isDeleted"));
    }
}
