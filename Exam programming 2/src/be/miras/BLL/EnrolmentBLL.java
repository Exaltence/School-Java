/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IEnrolmentBLL;
import be.miras.DAO.EnrolmentDAO;
import be.miras.DOMAIN.Enrolment;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shaun
 */
public class EnrolmentBLL implements IEnrolmentBLL{
    EnrolmentDAO enrolDAO = new EnrolmentDAO();

    @Override
    public Enrolment enrolUser(Enrolment entity) {
        return enrolDAO.enrolUser(entity);
    }

    @Override
    public Enrolment disEnrolUser(Enrolment entity) {
        return enrolDAO.disEnrolUser(entity);
    }

    @Override
    public ArrayList<Enrolment> GetAll() {
        return enrolDAO.GetAll();
    }

    @Override
    public Enrolment Create(Enrolment entity) {
        
        // 
        ArrayList<Enrolment> allEnrol = GetAll();
        Iterator<Enrolment> i = allEnrol.iterator();
        
        while(i.hasNext())
        {
            Enrolment e = i.next();
//            System.out.println("Course");
//            System.out.println(e.getCourseID() == entity.getCourseID());
//            System.out.println("Person");
//            System.out.println(e.getPersonID() == entity.getPersonID());
//            System.out.println("");
            if (e.getCourseID() == entity.getCourseID() && e.getPersonID() == entity.getPersonID())  // INTO README i tried so hard but i didn't succeed
            {
                
                return null;
            }
        }
        return enrolDAO.Create(entity);
    }

    @Override
    public void Update(Enrolment entity) {
        enrolDAO.Update(entity);
    }

    @Override
    public Enrolment GetById(int id) {
        return enrolDAO.GetById(id);
    }

    @Override
    public void Delete(Enrolment entity) {
        enrolDAO.Delete(entity);
    }

    @Override
    public ArrayList<Enrolment> getAllUserCourseIDs(int pid) {
        return enrolDAO.getAllUserCourseIDs(pid);
    }
    
}
