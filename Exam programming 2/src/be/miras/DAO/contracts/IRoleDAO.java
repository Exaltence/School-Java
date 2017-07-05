/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO.contracts;

/**
 *
 * @author shaun
 * @param <T>
 */
public interface IRoleDAO<T> {
    T GetById(int id);
}
