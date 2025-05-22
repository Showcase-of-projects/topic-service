package com.example.topic_service.services;

import com.example.topic_service.dtos.ExistenceResponse;
import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.entities.TopicEntity;
import com.example.topic_service.exceptions.TopicNotFoundException;
import com.example.topic_service.repositories.TopicRepository;
import com.example.topic_service.specifications.TopicSpecification;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private final TopicRepository topicRepository;
    private final ModelMapper modelMapper;

    public TopicService(TopicRepository topicRepository, ModelMapper modelMapper) {
        this.topicRepository = topicRepository;
        this.modelMapper = modelMapper;
    }

    public List<TopicDTO> getTopics(String name, Long departmentId, Long typeId) {
        Specification<TopicEntity> spec = Specification
                .where(TopicSpecification.notDeleted())
                .and(TopicSpecification.hasName(name))
                .and(TopicSpecification.hasDepartment(departmentId))
                .and(TopicSpecification.hasType(typeId));
        List<TopicDTO> topicDTOS = topicRepository.findAll(spec)
                .stream().map(topicEntity -> modelMapper.map(topicEntity, TopicDTO.class)).toList();
        return topicDTOS;
    }

    public TopicDTO getTopic(Long id) {
        TopicEntity topicEntity = topicRepository.findById(id)
                .orElseThrow();
        TopicDTO topicDTO = modelMapper.map(topicEntity, TopicDTO.class);
        return topicDTO;
    }

    public ExistenceResponse checkExistence(Long id) {
        if (topicRepository.findById(id).isPresent()) {
            return new ExistenceResponse(true);
        } else {
            throw new TopicNotFoundException("Topic with id " + id + " not found");
        }
    }
}
