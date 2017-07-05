/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL;

import be.miras.BLL.contracts.IUserBLL;
import be.miras.DAO.UserDAO;
import be.miras.DOMAIN.User;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public class UserBLL implements IUserBLL {
    
    private UserDAO uDAO = new UserDAO();
    
    @Override
    public User getByEmail(String email) {
        return uDAO.getByEmail(email);
    }

    @Override
    public ArrayList<User> GetAll() {
        return uDAO.GetAll();
    }

    @Override
    public User Create(User entity) {
        return uDAO.Create(entity);
    }

    @Override
    public void Update(User entity) {
        uDAO.Update(entity);
    }

    @Override
    public User GetById(int id) {
        return uDAO.GetById(id);
    }

    @Override
    public void Delete(User entity) {
        uDAO.Delete(entity);
    }
    
}
