/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalreport3;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author solom
 */
public class ButtonClass extends java.awt.Button{

    private int reduce; // The number of stones you want to pick.
    private int difficulty; // The difficulty of you want to play.
    
    public ButtonClass() {
        
    }

    public void setAll(int reduce,int difficulty){
        this.reduce = reduce;
        this.difficulty = difficulty;
        
    }
    public void setReduce(int reduce) {
        this.reduce = reduce;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

   

    public int getReduce() {
        return reduce;
    }

    public int getDifficulty() {
        return difficulty;
    }

    
    
    
}
