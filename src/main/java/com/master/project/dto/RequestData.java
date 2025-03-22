package com.master.project.dto;

import java.util.List;

public class RequestData {

    private boolean countOnly;

    private SearchCriteria  search;

    private Integer start;

    private Integer length;

    private List<FilterParam> filterParamList;

    public boolean isCountOnly() {
        return countOnly;
    }

    public void setCountOnly(boolean countOnly) {
        this.countOnly = countOnly;
    }

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

    public SearchCriteria getSearch() {
        return search;
    }

    public void setSearch(SearchCriteria search) {
        this.search = search;
    }

    public List<FilterParam> getFilterParamList() {
        return filterParamList;
    }

    public void setFilterParamList(List<FilterParam> filterParamList) {
        this.filterParamList = filterParamList;
    }
}
