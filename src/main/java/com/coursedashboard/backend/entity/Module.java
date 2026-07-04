package com.coursedashboard.backend.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "modules")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer moduleNumber;
    private String title;
    private String timeSlot;
    private String duration;
    private String startDate;
    private String endDate;

    @ElementCollection
    @CollectionTable(name = "module_days",
            joinColumns = @JoinColumn(name = "module_id"))
    private List<ModuleDay> days = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Integer getModuleNumber() { return moduleNumber; }
    public void setModuleNumber(Integer moduleNumber) { this.moduleNumber = moduleNumber; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getTimeSlot() { return timeSlot; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public List<ModuleDay> getDays() { return days; }
    public void setDays(List<ModuleDay> days) { this.days = days; }
}