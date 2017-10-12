/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shaun
 */
public class Sorteer {
    public ISorteer sort;
    

    public Sorteer(){
       
    }
    
    public int[] executeSorteer(int[] tobeSorted){
        
        return sort.Sort(tobeSorted);
    }
    
    public void setSortMethod(ISorteer newSort){
        sort = newSort;
    }
}
