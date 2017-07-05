/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import be.miras.DAO.contracts.IRoleDAO;
import be.miras.DOMAIN.Role;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class RoleDAO implements IRoleDAO {

    ConnectionDAO con = new ConnectionDAO();

    @Override
    public Object GetById(int id) {
        try {
            String Query = "SELECT * FROM role WHERE ID =" + id;
            ResultSet rs = con.executeQuery(Query);
            Role r = new Role();

            while (rs.next()) {
                r.setID(rs.getInt("ID"));
                r.setName(rs.getString("Name"));

                break;
            }
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
