/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IEnrolmentDAO;
import be.miras.DOMAIN.Enrolment;
import be.miras.DOMAIN.Status;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class EnrolmentDAO implements IEnrolmentDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public Enrolment enrolUser(Enrolment entity) {
        int PersonID = entity.getPersonID();
        int CourseID = entity.getCourseID();

        String Query = "UPDATE enrolment SET "
                + "PersonID = " + entity.getPersonID()
                + ", CourseID = " + entity.getCourseID()
                + ", Status = " + "'" + Status.Enrolled + "'"
                + " WHERE PersonID = " + PersonID + " AND CourseID = " + CourseID + ";";
        System.out.println(Query);
        return null;
    }

    @Override
    public Enrolment disEnrolUser(Enrolment entity) {
        int PersonID = entity.getPersonID();
        int CourseID = entity.getCourseID();

        String Query = "UPDATE enrolment SET "
                + "PersonID = " + entity.getPersonID()
                + ", CourseID = " + entity.getCourseID()
                + ", Status = " + "'" + Status.DisEnrolled + "'"
                + " WHERE PersonID = " + PersonID + " AND CourseID = " + CourseID + ";";
        System.out.println(Query);
        ResultSet rs = con.executeUpdate(Query);
        return null;
    }

    @Override
    public ArrayList<Enrolment> GetAll() {
        try {
            String Query = "SELECT * FROM enrolment";
            ResultSet rs = con.executeQuery(Query);
            Enrolment e = new Enrolment();
            ArrayList<Enrolment> enrolmentsResult = new ArrayList<>();
            while (rs.next()) {
                e.setPersonID((rs.getInt("PersonID")));
                e.setCourseID((rs.getInt("CourseID")));
                e.setStatus(Status.valueOf(rs.getString("Status")));
                enrolmentsResult.add(e);
            }
            return enrolmentsResult;
        } catch (SQLException ex) {
            Logger.getLogger(EnrolmentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Enrolment Create(Enrolment entity) {

        try {
            String Query = "INSERT INTO enrolment (PersonID, CourseID, Status) VALUES ('"
                    + entity.getPersonID() + "','"
                    + entity.getCourseID() + "','"
                    + entity.getStatus() + "');";
            System.out.println(Query);
            ResultSet rs = con.executeUpdate(Query);

            int id = 0;
            int id2 = 0;
            while (rs.next()) {
                id = rs.getInt(1);
                id2 = rs.getInt(2);
                break;
            }

            return getByIDs(id, id2);
        } catch (SQLException ex) {
            Logger.getLogger(EnrolmentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public void Update(Enrolment entity) {
        int PersonID = entity.getPersonID();
        int CourseID = entity.getCourseID();

        String Query = "UPDATE enrolment SET "
                + "PersonID" + "'" + entity.getPersonID() + "'" + "','"
                + "CourseID" + "'" + entity.getCourseID() + "'"
                + "Status" + "'" + entity.getStatus() + "'"
                + "WHERE PersonID=" + PersonID + " AND CourseID=" + CourseID + ";";
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Enrolment GetById(int id) {
        try {
            String Query = "SELECT * FROM enrolment WHERE PersonID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Enrolment er = new Enrolment();

            while (rs.next()) {
                er.setPersonID(rs.getInt("PersonID"));
                er.setCourseID(rs.getInt("CourseID"));
                er.setStatus(Status.valueOf(rs.getString("Status")));
                break;
            }
            return er;
        } catch (SQLException ex) {
            Logger.getLogger(EnrolmentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(Enrolment entity) {
        int pid = entity.getPersonID();
        int cid = entity.getCourseID();
        String Query = "Delete FROM enrolment WHERE PersonID =" + pid + " AND CourseID = " + cid;
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public Enrolment getByIDs(int cid, int pid) {
        try {
            String Query = "SELECT * FROM enrolment WHERE PersonID =" + pid + " AND CourseID = " + cid;
            ResultSet rs = con.executeQuery(Query);
            Enrolment er = new Enrolment();

            while (rs.next()) {
                er.setPersonID(rs.getInt("PersonID"));
                er.setCourseID(rs.getInt("CourseID"));
                er.setStatus(Status.valueOf(rs.getString("Status")));
                break;
            }
            return er;
        } catch (SQLException ex) {
            Logger.getLogger(EnrolmentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Enrolment> getAllUserCourseIDs(int pid) {
        String Query = "SELECT * FROM enrolment WHERE PersonID =" + pid;
        ResultSet rs = con.executeQuery(Query);
        Enrolment er = new Enrolment();
        ArrayList<Enrolment> allUserEnrolls = new ArrayList<>();

        try {
            while (rs.next()) {
                er.setPersonID(rs.getInt("PersonID"));
                er.setCourseID(rs.getInt("CourseID"));
                er.setStatus(Status.valueOf(rs.getString("Status")));
                allUserEnrolls.add(er);
                break;
            }
            return allUserEnrolls;
        } catch (SQLException ex) {
            Logger.getLogger(EnrolmentDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
