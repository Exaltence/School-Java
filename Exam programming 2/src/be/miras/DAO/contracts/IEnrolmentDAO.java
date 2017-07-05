/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO.contracts;

import be.miras.DOMAIN.Course;
import be.miras.DOMAIN.Enrolment;
import be.miras.DOMAIN.User;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public interface IEnrolmentDAO extends IGenericDAO<Enrolment>{
    Enrolment enrolUser(Enrolment entity);
    Enrolment disEnrolUser(Enrolment entity);
    Enrolment getByIDs(int cid, int pid);
    ArrayList<Enrolment> getAllUserCourseIDs(int pid);
}
