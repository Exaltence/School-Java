/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.ICourseBLL;
import be.miras.DAO.CourseDAO;
import be.miras.DOMAIN.Course;
import be.miras.DOMAIN.Education;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public class CourseBLL implements ICourseBLL {

    private CourseDAO cDAO = new CourseDAO();
            
    @Override
    public Course getByName(String name) {
        return cDAO.getByName(name);
    }

    @Override
    public ArrayList<Course> GetAll() {
       return cDAO.GetAll();
    }

    @Override
    public Course Create(Course entity) {
        return cDAO.Create(entity);
    }

    @Override
    public void Update(Course entity) {
       cDAO.Update(entity);
    }

    @Override
    public Course GetById(int id) {
        return cDAO.GetById(id);
    }

    @Override
    public void Delete(Course entity) {
        cDAO.Delete(entity);
    }

    @Override
    public ArrayList<Course> GetByEdu(Education edu) {
        return cDAO.GetByEdu(edu);
    }
    
}
