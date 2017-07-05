/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IRoleBLL;
import be.miras.DAO.RoleDAO;

/**
 *
 * @author shaun
 */
public class RoleBLL implements IRoleBLL{
    
    RoleDAO rDAO = new RoleDAO();

    @Override
    public Object GetById(int id) {
        return rDAO.GetById(id);
    }
    
}
