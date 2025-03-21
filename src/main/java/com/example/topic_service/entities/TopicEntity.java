package com.example.topic_service.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "topics")
public class TopicEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(name = "problem_carrier", nullable = false)
    private String problemCarrier;

    @Column(nullable = false)
    private String goal;

    @Column(name = "existing_solutions", nullable = false)
    private String existingSolutions;

    @Column(nullable = false)
    private String keywords;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeEntity typeEntity;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private DepartmentEntity departmentEntity;

    @OneToMany(mappedBy = "topicEntity")
    private List<BookingEntity> bookingEntity;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    protected TopicEntity() {
    }

    public TopicEntity(String name, String problemCarrier, String goal, String existingSolutions, String keywords, TypeEntity typeEntity, DepartmentEntity departmentEntity) {
        this.name = name;
        this.problemCarrier = problemCarrier;
        this.goal = goal;
        this.existingSolutions = existingSolutions;
        this.keywords = keywords;
        this.typeEntity = typeEntity;
        this.departmentEntity = departmentEntity;
        this.isDeleted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblemCarrier() {
        return problemCarrier;
    }

    public void setProblemCarrier(String problemCarrier) {
        this.problemCarrier = problemCarrier;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getExistingSolutions() {
        return existingSolutions;
    }

    public void setExistingSolutions(String existingSolutions) {
        this.existingSolutions = existingSolutions;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        this.typeEntity = typeEntity;
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public List<BookingEntity> getBookingEntity() {
        return bookingEntity;
    }
}
