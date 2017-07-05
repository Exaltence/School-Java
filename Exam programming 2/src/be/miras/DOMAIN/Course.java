/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DOMAIN;

import java.util.Date;

/**
 *
 * @author shaun
 */
public class Course {

    private int ID;
    private String name;
    private int hours;
    private Date startDate;
    private Date endDate;
    private String description;

    public Course() {
    }

    public Course(int ID, String name, int hours, Date startDate, Date endDate, String description) {
        this.ID = ID;
        this.name = name;
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Course(int ID, String name, int hours, Date startDate, Date endDate) {
        this.ID = ID;
        this.name = name;
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
