/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IEduction_CourseDAO;
import be.miras.DOMAIN.Course;
import be.miras.DOMAIN.Education;
import be.miras.DOMAIN.Education_Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class Education_CourseDAO implements IEduction_CourseDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public ArrayList<Education_Course> GetAll() {
        try {
            String Query = "SELECT * FROM education_course";
            ResultSet rs = con.executeQuery(Query);
            Education_Course ec = new Education_Course();
            ArrayList<Education_Course> ecResult = new ArrayList<>();
            while (rs.next()) {

                ec.setEducation(new Education(rs.getInt("EducationID")));
                ec.setCourse(new Course(rs.getInt("CourseID")));
                ecResult.add(ec);

            }
            return ecResult;
        } catch (SQLException ex) {
            Logger.getLogger(Education_CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Education_Course Create(Education_Course entity) {

        String Query = "INSERT INTO education_course(EducationID, CourseID) VALUES ('"
                + entity.getEducationID() + "','"
                + entity.getCourseID() + "');";
        ResultSet rs = con.executeUpdate(Query);
        return null;
    }

    @Override
    public void Update(Education_Course entity) {
        int id = entity.getEducation().getID();
        String Query = "UPDATE education_course SET "
                + "EducationID=" + "'" + entity.getEducationID() + "'" + "','"
                + "CourseID=" + "'" + entity.getCourseID() + "' WHERE ID=" + id + ";";
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Education_Course GetById(int id) {
        try {
            String Query = "SELECT * FROM education_course WHERE EducationID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Education_Course ec = new Education_Course();

            while (rs.next()) {
                ec.setEducation(new Education(rs.getInt("EducationID")));
                ec.setCourse(new Course(rs.getInt("CourseID")));
                break;
            }
            return ec;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(Education_Course entity) {

        int id = entity.getEducationID();
        String Query = "Delete FROM education_course WHERE CourseID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public ArrayList<Integer> getAllByEducationID(int EducationID) {
        try {
            String Query = "SELECT * FROM education_course WHERE EducationID =" + EducationID;
            ResultSet rs = con.executeQuery(Query);
            ArrayList<Integer> ecResult = new ArrayList<>();
            while (rs.next()) {
                ecResult.add(rs.getInt("CourseID"));
            }
            return ecResult;
        } catch (SQLException ex) {
            Logger.getLogger(Education_CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int getEduByCourseID(int CourseID) {
        try {
            String Query = "SELECT * FROM education_course WHERE CourseID = " + CourseID;
            ResultSet rs = con.executeQuery(Query);
            // ArrayList<Integer> ecResult = new ArrayList<>();
            int eduID = 0;
            while (rs.next()) {
                eduID = (rs.getInt("EducationID"));
                break;
            }
            return eduID;
        } catch (SQLException ex) {
            Logger.getLogger(Education_CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

}
