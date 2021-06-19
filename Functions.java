/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalreport2;

import java.util.Random;

/**
 *
 * @author solom
 */
public class Functions {

    
    public Functions() {
    }
    private static final int pc = 1;
    private static final int user = 0;
    private static final int lose = 0;
    private static final int win = 1;
    public int stonePicker(int stones,int player,int steps){
        
        int[] step = new int[3];
        
        if(stones == 0){
            if(player == user){
                return win;
            }else{
                return lose;
            }
        }else if(steps==0){
            Random r = new Random();
            int rand = r.nextInt();
            if(rand%4==0){
                return win;
            }else{
                return lose;
            }
        }
        int nextPlayer = 1-player;
        if(stones-1 >= 0){
            step[0] = stonePicker(stones-1,nextPlayer,steps-1);
        }
        if(stones-2 >= 0){
            step[1] = stonePicker(stones-2,nextPlayer,steps-1);
        }
        if(stones-3 >= 0){
            step[2] = stonePicker(stones-3,nextPlayer,steps-1);
        }
        if(player == pc){
            for (int i = 0; i < step.length; i++) {
                if(step[i]==win){
                    return win;
                }
                
            }
            return lose;
        }else{
            for (int i = 0; i < step.length; i++) {
                if(step[i]==lose){
                    return lose;
                }
                
            }
            return win;
        }
        
    }
    public int pcTurn(int a,int level){
            if(a-1>=0 && this.stonePicker(a-1,0,level) == 1){
                System.out.println("1");
                a = a-1;
                return 1;
            }else if(a-2>=0 && this.stonePicker(a-2,0,level) == 1){
                System.out.println("2");
                a = a-2;
                return 2;
            }else if(a-3>=0 && this.stonePicker(a-3,0,level)==1){
                System.out.println("3");
                a = a-3;
                return 3;
            }else{
                Random r = new Random();
                int turn = (r.nextInt(3)+1);
                a = a-turn;
                return turn;
            }
    }
    public static int randomDigits(){
        Random r = new Random();
        return r.nextInt(10)+5;
        
    }
}
