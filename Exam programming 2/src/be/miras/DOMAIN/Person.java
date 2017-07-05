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
//person implementeert alles van user
public class Person extends User {

    private int ID;
    private String firstname;
    private String lastname;
    private Date dob;
    private String address;
    private String SSID;

    public Person() {
    }

    public Person(int ID) {
        this.ID = ID;
    }

    public Person(int ID, String firstname, String lastname, Date dob, String address) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.address = address;
    }

    public Person(int ID, String firstname, String lastname, Date dob, String address, String SSID) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.address = address;
        this.SSID = SSID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getID() {
        return ID;
    }

    public Date getDob() {
        return dob;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
