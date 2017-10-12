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
public class Insertion implements ISorteer {

    @Override
    public int[] Sort(int[] tobeSorted) {

        int temp;
        for (int i = 1; i < tobeSorted.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tobeSorted[j] < tobeSorted[j - 1]) {
                    temp = tobeSorted[j];
                    tobeSorted[j] = tobeSorted[j - 1];
                    tobeSorted[j - 1] = temp;
                }
            }
        }
        return tobeSorted;
    }

}
