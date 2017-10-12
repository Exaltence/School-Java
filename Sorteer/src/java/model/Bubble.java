package model;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
package model;

/**
 *
 * @author shaun
 */
public class Bubble implements ISorteer {

    @Override
    public int[] Sort(int[] tobeSorted) {

        int n = tobeSorted.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tobeSorted[j - 1] > tobeSorted[j]) {
                    //swap elements  
                    temp = tobeSorted[j - 1];
                    tobeSorted[j - 1] = tobeSorted[j];
                    tobeSorted[j] = temp;
                }
            }
        }
        return tobeSorted;
    }
}
