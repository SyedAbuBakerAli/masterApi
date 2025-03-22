package com.master.project.dto;


import java.util.Map;

public class MasterApiRequest {

    private RequestData data;

    private Map<String, Object> fields;

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    public RequestData getData() {
        return data;
    }

    public void setData(RequestData data) {
        this.data = data;
    }
}
