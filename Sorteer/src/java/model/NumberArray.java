/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author shaun
 */
public class NumberArray {

    private int[] anArray;

    private int randomGen(int grootste) {
        Random rand = new Random();
        int randomNum = rand.nextInt(grootste);
        return randomNum;
    }

    public int[] randomFill(int aantal, int grootste) {

        anArray = new int[aantal];
        for (int i = 0; i < anArray.length; i++) {
            Random rand = new Random();
            anArray[i] = rand.nextInt(grootste);
        }
        return anArray;

    }
}
