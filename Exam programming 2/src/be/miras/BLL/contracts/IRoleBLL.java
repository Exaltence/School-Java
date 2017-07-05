/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

/**
 *
 * @author shaun
 * @param <T>
 */
public interface IRoleBLL<T> {
    T GetById(int id);
}
