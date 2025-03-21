package com.example.topic_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "bookings")
public class BookingEntity extends BaseEntity {
    @Column(name = "team_id", nullable = false)
    private Long teamId;

    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private TopicEntity topicEntity;

    private LocalDateTime bookingTime;

    protected BookingEntity() {
    }

    public BookingEntity(Long teamId, TopicEntity topicEntity) {
        this.teamId = teamId;
        this.topicEntity = topicEntity;
        this.bookingTime = LocalDateTime.now();
    }

    public Long getTeamId() {
        return teamId;
    }

    public TopicEntity getTopicEntity() {
        return topicEntity;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }
}
