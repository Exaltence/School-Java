/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.BLL.contracts;

import be.miras.DOMAIN.Person;
import java.util.ArrayList;

/**
 *
 * @author shaun
 */
public interface IPersonBLL extends IGenericBLL<Person>{
    Person getByLastName(String lastname);
    Person getBySSID(String SSID);
}
