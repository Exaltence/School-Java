/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

import be.miras.DOMAIN.Education_Course;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public interface IEduction_CourseBLL extends IGenericBLL<Education_Course> {
    ArrayList<Integer> getAllByEducationID(int EducationID);
}
