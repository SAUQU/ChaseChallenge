
package com.example.segundoauqui.chasechallenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Qpf {

    @SerializedName("english")
    @Expose
    private String english;
    @SerializedName("metric")
    @Expose
    private String metric;

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

}
