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
public class Enrolment {

    private Person person;
    private Course course;
    private Status status;
    private int personID;
    private int courseID;

    public Enrolment(Status status, int personID, int courseID) {
        this.status = status;
        this.personID = personID;
        this.courseID = courseID;
    }

    public Enrolment() {
    }

    public Enrolment(Person person, Course course, Status status) {
        this.person = person;
        this.course = course;
        personID = person.getID();
        courseID = course.getID();
        this.status = status;
    }

    public Enrolment(Status status, int personID) {
        this.status = status;
        this.personID = personID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public Integer getStatusBit() {
        if (status.equals(Status.Enrolled)) {
            return 1;
        } else {
            return 0;
        }

    }

}
