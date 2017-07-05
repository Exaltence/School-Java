/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IEducationDAO;
import be.miras.DOMAIN.Education;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class EducationDAO implements IEducationDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public Education getByName(String name) {
        try {
            String Query = "SELECT * FROM education WHERE Name = '" + name + "'";
            ResultSet rs = con.executeQuery(Query);
            Education e = new Education();

            while (rs.next()) {
                e.setID(rs.getInt("ID"));
                e.setName(rs.getString("Name"));
                break;
            }
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EducationDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Education> GetAll() {
        try {
            String Query = "SELECT * FROM education";
            ResultSet rs = con.executeQuery(Query);

            ArrayList<Education> educationResult = new ArrayList<>();
            while (rs.next()) {
                Education c = new Education();
                c.setID(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                educationResult.add(c);

            }
            return educationResult;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Education Create(Education entity) {
        try {
            String Query = "INSERT INTO education (ID, Name) VALUES ('"
                    + entity.getID() + "','"
                    + entity.getName() + "');";

            ResultSet rs = con.executeUpdate(Query);

            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
                break;
            }

            return GetById(id);
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(Education entity) {
        int id = entity.getID();
        String Query = "UPDATE education SET "
                + "Name=" + "'" + entity.getName()
                + "' WHERE ID=" + id + ";";

        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Education GetById(int id) {
        try {
            String Query = "SELECT * FROM education WHERE ID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Education e = new Education();

            while (rs.next()) {
                e.setID(rs.getInt("ID"));
                e.setName(rs.getString("Name"));
                break;
            }
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(Education entity) {
        int id = entity.getID();
        String Query = "Delete FROM education WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

}
