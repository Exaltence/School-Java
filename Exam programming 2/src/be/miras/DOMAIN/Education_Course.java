/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DOMAIN;

/**
 *
 * @author shaun
 */
public class Education_Course {

    private Education education;
    private Course course;
    private int educationID;
    private int courseID;

    public Education_Course() {
    }

    public Education_Course(int educationID, int courseID) {
        this.educationID = educationID;
        this.courseID = courseID;
    }

    public Education_Course(Education education, Course course) {
        this.education = education;
        this.course = course;
    }

    public Education_Course(Education education, Course course, int educationID, int courseID) {
        this.education = education;
        this.course = course;
        this.educationID = educationID;
        this.courseID = courseID;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getEducationID() {
        return educationID;
    }

    public void setEducationID(int educationID) {
        this.educationID = educationID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

}
