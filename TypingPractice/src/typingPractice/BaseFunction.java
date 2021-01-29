/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingPractice;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class BaseFunction {
    
    
    
    private String start;
    
    Scanner in = new Scanner(System.in);
    
    public String getStart(){
        
    
        return start;
    }
    
    public void getStart(String s){
        start = s;
    }
}
