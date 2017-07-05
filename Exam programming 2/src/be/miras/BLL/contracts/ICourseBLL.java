/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

import be.miras.DOMAIN.Course;
import be.miras.DOMAIN.Education;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public interface ICourseBLL extends IGenericBLL<Course> {
    Course getByName(String name);
    ArrayList<Course> GetByEdu(Education edu);
}
