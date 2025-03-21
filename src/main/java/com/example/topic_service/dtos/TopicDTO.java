package com.example.topic_service.dtos;

public class TopicDTO {
    private Long id;
    private String name;
    private String problemCarrier;
    private String goal;
    private String existingSolutions;
    private String keywords;
    private TypeDTO typeDTO;
    private DepartmentDTO departmentDTO;

    public TopicDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public TypeDTO getTypeDTO() {
        return typeDTO;
    }

    public void setTypeDTO(TypeDTO typeDTO) {
        this.typeDTO = typeDTO;
    }

    public DepartmentDTO getDepartmentDTO() {
        return departmentDTO;
    }

    public void setDepartmentDTO(DepartmentDTO departmentDTO) {
        this.departmentDTO = departmentDTO;
    }
}
