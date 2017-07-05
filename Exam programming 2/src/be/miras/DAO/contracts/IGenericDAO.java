/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO.contracts;

import java.util.ArrayList;

/**
 *
 * @author shaun
 * @param <T>
 */
public interface IGenericDAO<T> {

    ArrayList<T> GetAll();
    T Create(T entity);
    void Update(T entity);
    T GetById(int id);
    void Delete(T entity);

}
