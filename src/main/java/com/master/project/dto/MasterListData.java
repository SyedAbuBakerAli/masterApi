package com.master.project.dto;


import com.master.project.entity.OptionFrequency;
import com.master.project.entity.OptionType;
import com.master.project.entity.PlanType;
import com.master.project.entity.Sector;

public class MasterListData {
    private String parentCode;
    private String parentName;
    private String name;
    private PlanType plan;
    private OptionType option;
    private OptionFrequency optionFrequency;
    private String subCategory;
    private Sector sector;
    private String benchmark;
    private Integer faceValue;

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
