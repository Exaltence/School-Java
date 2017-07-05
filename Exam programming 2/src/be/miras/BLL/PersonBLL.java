/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IPersonBLL;
import be.miras.DAO.PersonDAO;
import be.miras.DOMAIN.Person;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public class PersonBLL implements IPersonBLL{
    PersonDAO pDAO= new PersonDAO();
    @Override
    public Person getByLastName(String lastname) {
        return pDAO.getByLastName(lastname);
    }

    @Override
    public Person getBySSID(String SSID) {
        return pDAO.getBySSID(SSID);
    }

    @Override
    public ArrayList<Person> GetAll() {
        return pDAO.GetAll();
    }

    @Override
    public Person Create(Person entity) {
        return pDAO.Create(entity);
    }

    @Override
    public void Update(Person entity) {
        pDAO.Update(entity);
    }

    @Override
    public Person GetById(int id) {
       return pDAO.GetById(id);
    }

    @Override
    public void Delete(Person entity) {
        pDAO.Delete(entity);
    }
    
}
