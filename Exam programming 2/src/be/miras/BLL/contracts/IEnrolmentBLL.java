/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

import be.miras.DOMAIN.Enrolment;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public interface IEnrolmentBLL extends IGenericBLL<Enrolment>{
    Enrolment enrolUser(Enrolment entity);
    Enrolment disEnrolUser(Enrolment entity);
    ArrayList<Enrolment> getAllUserCourseIDs(int pid);
}
