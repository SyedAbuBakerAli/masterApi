package com.master.project.dto;

import java.util.List;

public class MasterListResponse {
    private Integer start;
    private Integer length;
    private int totalRecords;
    private List<MasterListData> data;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<MasterListData> getData() {
        return data;
    }

    public void setData(List<MasterListData> data) {
        this.data = data;
    }
}
