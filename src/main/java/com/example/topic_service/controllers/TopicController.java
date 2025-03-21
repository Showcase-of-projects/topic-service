package com.example.topic_service.controllers;

import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.services.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<TopicDTO>> getTopics() {
        List<TopicDTO> topicDTOS = topicService.getTopics();
        return ResponseEntity.ok(topicDTOS);
    }
}
