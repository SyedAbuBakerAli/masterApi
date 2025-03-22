package com.master.project.entity;

import jakarta.persistence.*;

@Entity
public class MasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String parentCode;
    private String parentName;
    private String name;
    @Enumerated(EnumType.STRING)
    private PlanType plan;

    @Enumerated(EnumType.STRING)
    private OptionType option;

    @Enumerated(EnumType.STRING)
    private OptionFrequency optionFrequency;
    private String subCategory;
    @Enumerated(EnumType.STRING)
    private Sector sector;

    private String benchmark;
    private Integer faceValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanType getPlan() {
        return plan;
    }

    public void setPlan(PlanType plan) {
        this.plan = plan;
    }

    public OptionType getOption() {
        return option;
    }

    public void setOption(OptionType option) {
        this.option = option;
    }

    public OptionFrequency getOptionFrequency() {
        return optionFrequency;
    }

    public void setOptionFrequency(OptionFrequency optionFrequency) {
        this.optionFrequency = optionFrequency;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(String benchmark) {
        this.benchmark = benchmark;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }
}
