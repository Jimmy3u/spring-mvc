package com.study.springmvc.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//TODO: JPA Annotations
@Entity
public class Discipline {
    @Id
    @GeneratedValue()
    private Long disciplineId;
    private String disciplineName;
    private String discipleDescription;
    private List<Discipline> preRequisitedDiscipline;

    public List<Discipline> getPreRequisitedDiscipline() {
        return preRequisitedDiscipline;
    }

    public void setPreRequisitedDiscipline(List<Discipline> preRequisitedDiscipline) {
        this.preRequisitedDiscipline = preRequisitedDiscipline;
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getDiscipleDescription() {
        return discipleDescription;
    }

    public void setDiscipleDescription(String discipleDescription) {
        this.discipleDescription = discipleDescription;
    }

}
