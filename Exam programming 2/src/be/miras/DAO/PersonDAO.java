/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IPersonDAO;
import be.miras.DOMAIN.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class PersonDAO implements IPersonDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public Person getByLastName(String lastname) {
        try {
            String Query = "SELECT * FROM person WHERE Lastname= '" + lastname + "'";
            ResultSet rs = con.executeQuery(Query);
            Person p = new Person();

            while (rs.next()) {
                //Retrieve by column name
                p.setID(rs.getInt("ID"));
                p.setFirstname(rs.getString("Firstname"));
                p.setLastname(rs.getString("Lastname"));
                p.setDob(rs.getDate("Dob"));
                p.setAddress(rs.getString("Address"));
                p.setSSID(rs.getString("SSID"));

                break;
            }
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Person getBySSID(String SSID) {
        try {
            String Query = "SELECT * FROM person WHERE SSID=" + SSID;
            ResultSet rs = con.executeQuery(Query);
            Person p = new Person();

            while (rs.next()) {
                p.setID(rs.getInt("ID"));
                p.setFirstname(rs.getString("Firstname"));
                p.setLastname(rs.getString("Lastname"));
                p.setDob(rs.getDate("Dob"));
                p.setAddress(rs.getString("Adress"));
                p.setSSID(rs.getString("SSID"));
                break;
            }
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Person> GetAll() {
        try {
            String Query = "SELECT * FROM person";
            ResultSet rs = con.executeQuery(Query);

            ArrayList<Person> personsResult = new ArrayList<>();

            while (rs.next()) {
                Person p = new Person();
                //Retrieve by column name
                p.setID(rs.getInt("ID"));
                p.setFirstname(rs.getString("Firstname"));
                p.setLastname(rs.getString("Lastname"));
                p.setDob(rs.getDate("Dob"));
                p.setAddress(rs.getString("Address"));
                p.setSSID(rs.getString("SSID"));
                personsResult.add(p);

            }
            return personsResult;
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Person Create(Person entity) {
        try {
            String Query = "INSERT INTO person (ID, Firstname, Lastname, Dob, Address, SSID) VALUES ('" + entity.getID() + "',   '"
                    + entity.getFirstname() + "','"
                    + entity.getLastname() + "','"
                    + new java.sql.Date(entity.getDob().getTime()) + "','"
                    + entity.getAddress() + "','"
                    + entity.getSSID() + "');";

            ResultSet rs = con.executeUpdate(Query);

            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
                break;
            }
            return GetById(id);
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(Person entity) {
        int id = entity.getID();
        String Query = "UPDATE person SET "
                + "Firstname=" + "'" + entity.getFirstname() + "'" + ", "
                + "Lastname=" + "'" + entity.getLastname() + "'" + ", "
                + "Dob=" + "'" + new java.sql.Date(entity.getDob().getTime()) + "'" + ", "
                + "Address=" + "'" + entity.getAddress() + "'" + ", "
                + "SSID=" + "'" + entity.getSSID() + "'"
                + " WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Person GetById(int id) {
        try {
            String Query = "SELECT * FROM person WHERE ID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Person p = new Person();

            while (rs.next()) {
                p.setID(rs.getInt("ID"));
                p.setFirstname(rs.getString("Firstname"));
                p.setLastname(rs.getString("Lastname"));
                p.setDob(rs.getDate("Dob"));
                p.setAddress(rs.getString("Address"));
                p.setSSID(rs.getString("SSID"));
                break;
            }
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(Person entity) {
        int id = entity.getID();
        String Query = "Delete FROM person WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

}
