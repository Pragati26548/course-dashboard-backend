package com.coursedashboard.backend.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class ModuleDay {

    private String date;
    private Integer calDay;
    private Integer calMonth;
    private Integer calYear;
    private String topic;

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public Integer getCalDay() { return calDay; }
    public void setCalDay(Integer calDay) { this.calDay = calDay; }
    public Integer getCalMonth() { return calMonth; }
    public void setCalMonth(Integer calMonth) { this.calMonth = calMonth; }
    public Integer getCalYear() { return calYear; }
    public void setCalYear(Integer calYear) { this.calYear = calYear; }
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }
}