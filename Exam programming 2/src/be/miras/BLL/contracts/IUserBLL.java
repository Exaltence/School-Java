/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

import be.miras.DOMAIN.User;

/**
 *
 * @author shaun
 */
public interface IUserBLL extends IGenericBLL<User> {
    User getByEmail(String email);
}
