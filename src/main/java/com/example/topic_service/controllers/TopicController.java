package com.example.topic_service.controllers;

import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.services.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ResponseEntity<List<TopicDTO>> getTopics(@RequestParam(required = false) String name,
                                                    @RequestParam(required = false) Long departmentId,
                                                    @RequestParam(required = false) Long typeId) {
        List<TopicDTO> topicDTOS = topicService.getTopics(name, departmentId, typeId);
        return ResponseEntity.ok(topicDTOS);
    }
}
