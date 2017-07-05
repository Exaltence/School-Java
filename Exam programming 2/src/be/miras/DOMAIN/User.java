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

public class User {

    private int ID;
    private String email;
    private String password;
    private int roleID;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public User(int ID, String email, String password) {
        this.ID = ID;
        this.email = email;
        this.password = password;
    }

    public User(int ID, String email, String password, int roleID) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.roleID = roleID;
    }

    public User(int ID, String email, int roleID) {
        this.ID = ID;
        this.email = email;
        this.roleID = roleID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
}
