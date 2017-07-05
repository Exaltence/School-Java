/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO.contracts;

import be.miras.DOMAIN.Education;

/**
 *
 * @author shaun
 */
public interface IEducationDAO extends IGenericDAO<Education> {
    Education getByName(String name);
}
