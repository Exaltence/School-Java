/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.ICourseDAO;
import be.miras.DOMAIN.Course;
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
public class CourseDAO implements ICourseDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public Course getByName(String name) {
        try {
            String Query = "SELECT * FROM course WHERE Name =  '" + name + "'";
            ResultSet rs = con.executeQuery(Query);
            Course c = new Course();

            while (rs.next()) {
                c.setID(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setHours(rs.getInt("Hours"));
                c.setStartDate(rs.getDate("Startdate"));
                c.setEndDate(rs.getDate("Enddate"));
                c.setDescription(rs.getString("Description"));
                break;
            }
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Course> GetAll() {
        try {
            String Query = "SELECT * FROM course";
            ResultSet rs = con.executeQuery(Query);

            ArrayList<Course> coursesResult = new ArrayList<>();
            while (rs.next()) {
                Course c = new Course();
                c.setID(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setHours(rs.getInt("Hours"));
                c.setStartDate(rs.getDate("Startdate"));
                c.setEndDate(rs.getDate("Enddate"));
                c.setDescription(rs.getString("Description"));
                coursesResult.add(c);

            }
            return coursesResult;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Course Create(Course entity) {
        try {
            String Query = "INSERT INTO course (ID, Name, Hours, Startdate, Enddate, Description) VALUES ('"
                    + entity.getID() + "','"
                    + entity.getName() + "','"
                    + entity.getHours() + "','"
                    + new java.sql.Date(entity.getStartDate().getTime()) + "','"
                    + new java.sql.Date(entity.getStartDate().getTime()) + "','"
                    + entity.getDescription() + "');";

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
    public void Update(Course entity) {
        int id = entity.getID();
        String Query = "UPDATE course SET "
                + "Name=" + "'" + entity.getName() + "' ,"
                + "Hours=" + entity.getHours() + " ,"
                + "Startdate=" + "'" + new java.sql.Date(entity.getStartDate().getTime()) + "' ,"
                + "Enddate=" + "'" + new java.sql.Date(entity.getEndDate().getTime()) + "' ,"
                + "Description=" + "'" + entity.getDescription() + "' WHERE ID=" + id + ";";
        System.out.println(Query);
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Course GetById(int id) {
        try {
            String Query = "SELECT * FROM course WHERE ID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Course c = new Course();

            while (rs.next()) {
                c.setID(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setHours(rs.getInt("Hours"));
                c.setStartDate(rs.getDate("Startdate"));
                c.setEndDate(rs.getDate("Enddate"));
                c.setDescription(rs.getString("Description"));
                break;
            }
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(Course entity) {
        int id = entity.getID();
        String Query = "Delete FROM course WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public ArrayList<Course> GetByEdu(Education edu) {
        try {
            ConnectionDAO con = new ConnectionDAO();
            String Query = "SELECT * FROM Course, education_course, Education WHERE course.ID = CourseID AND EducationID = education.ID AND Education.id = " + edu.getID();
            ResultSet rs = con.executeQuery(Query);
            ArrayList<Course> courses = new ArrayList<>();

            while (rs.next()) {
                Course c = new Course();
                c.setID(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setHours(rs.getInt("Hours"));
                c.setStartDate(rs.getDate("Startdate"));
                c.setEndDate(rs.getDate("Enddate"));
                c.setDescription(rs.getString("Description"));
                courses.add(c);
            }
            return courses;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
