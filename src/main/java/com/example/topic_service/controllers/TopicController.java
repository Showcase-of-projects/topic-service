package com.example.topic_service.controllers;

import com.example.topic_service.dtos.ExistenceResponse;
import com.example.topic_service.dtos.TopicDTO;
import com.example.topic_service.services.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get/{id}")
    public ResponseEntity<TopicDTO> getTopic(@PathVariable("id") Long id) {
        TopicDTO topicDTO = topicService.getTopic(id);
        return ResponseEntity.ok(topicDTO);
    }

    @GetMapping("/check-existence/{id}")
    public ResponseEntity<ExistenceResponse> checkExistence(@PathVariable("id") Long id) {
        ExistenceResponse existenceResponse = topicService.checkExistence(id);
        return ResponseEntity.ok(existenceResponse);
    }
}
