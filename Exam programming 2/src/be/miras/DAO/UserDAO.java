/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IUserDAO;
import be.miras.DOMAIN.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class UserDAO implements IUserDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public User getByEmail(String email) {
        try {
            String Query = "SELECT * FROM user WHERE Email = '" + email + "'";
            ResultSet rs = con.executeQuery(Query);
            User u = new User();
            while (rs.next()) {
                //Retrieve by column name
                u.setID(rs.getInt("ID"));
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setRoleID(rs.getInt("RoleID"));
                break;
            }
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<User> GetAll() {
        try {
            String Query = "SELECT * FROM user";
            ResultSet rs = con.executeQuery(Query);
            ArrayList<User> userResult = new ArrayList<>();

            while (rs.next()) {
                User u = new User();
                //Retrieve by column name
                u.setID(rs.getInt("ID"));
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setRoleID(rs.getInt("RoleID"));
                userResult.add(u);
            }
            return userResult;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public User Create(User entity) {
        try {
            String Query = "INSERT INTO user (Email, Password, RoleID) VALUES ('"
                    + entity.getEmail() + "','"
                    + entity.getPassword() + "','"
                    + entity.getRoleID() + "');";

            ResultSet rs = con.executeUpdate(Query);

            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
                break;
            }
            return GetById(id);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Update(User entity) {
        int id = entity.getID();
        String Query = "UPDATE user SET "
                + "Email=" + "'" + entity.getEmail() + "' ,"
                + "Password=" + "'" + entity.getPassword() + "' ,"
                + "RoleID=" + entity.getRoleID()
                + " WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

    @Override
    public User GetById(int id) {
        try {
            //QUERY HIER EN RETOUR OBJECT
            String Query = "SELECT * FROM user WHERE ID =" + id;

            ResultSet rs = con.executeQuery(Query);

            User u = new User();

            while (rs.next()) {
                u.setID(rs.getInt("ID"));
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setRoleID(rs.getInt("RoleID"));

                break;
            }
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void Delete(User entity) {
        int id = entity.getID();
        String Query = "Delete FROM user WHERE ID =" + id;
        ResultSet rs = con.executeUpdate(Query);
    }

}
