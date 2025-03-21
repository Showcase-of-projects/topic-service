package com.example.topic_service.services;

import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.repositories.TopicRepository;
import org.modelmapper.ModelMapper;
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

    public List<TopicDTO> getTopics() {
        List<TopicDTO> topicDTOS = topicRepository.findAll()
                .stream().map(topicEntity -> modelMapper.map(topicEntity, TopicDTO.class)).toList();
        return topicDTOS;
    }
}
