/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IEduction_CourseBLL;
import be.miras.DAO.Education_CourseDAO;
import be.miras.DOMAIN.Education;
import be.miras.DOMAIN.Education_Course;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public class Education_CourseBLL implements IEduction_CourseBLL{
    Education_CourseDAO ecDAO = new Education_CourseDAO();
    
    @Override
    public ArrayList<Education_Course> GetAll() {
        return ecDAO.GetAll();
    }

    @Override
    public Education_Course Create(Education_Course entity) {
        return ecDAO.Create(entity);
    }

    @Override
    public void Update(Education_Course entity) {
         ecDAO.Update(entity);
    }

    @Override
    public Education_Course GetById(int id) {
        return ecDAO.GetById(id);
    }

    @Override
    public void Delete(Education_Course entity) {
        ecDAO.Delete(entity);
    }

    @Override
    public ArrayList<Integer> getAllByEducationID(int EducationID) {
        return ecDAO.getAllByEducationID(EducationID);
    }

    public int getEduByCourseID(int courseid) {
        return ecDAO.getEduByCourseID(courseid);
    }


    
}
