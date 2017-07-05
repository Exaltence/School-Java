/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IEducationBLL;
import be.miras.DAO.EducationDAO;
import be.miras.DOMAIN.Education;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public class EducationBLL implements IEducationBLL {
    EducationDAO eDAO = new EducationDAO();
    
    @Override
    public Education getByName(String name) {
       return eDAO.getByName(name);
    }

    @Override
    public ArrayList<Education> GetAll() {
        return eDAO.GetAll();
    }

    @Override
    public Education Create(Education entity) {
        return eDAO.Create(entity);
    }

    @Override
    public void Update(Education entity) {
        eDAO.Update(entity);
    }

    @Override
    public Education GetById(int id) {
       return eDAO.GetById(id);
    }

    @Override
    public void Delete(Education entity) {
        eDAO.Delete(entity);
    }
    
}
