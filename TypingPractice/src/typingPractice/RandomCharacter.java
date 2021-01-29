/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingPractice;

import java.util.Random;

/**
 *
 * @author Matt
 */
public class RandomCharacter {
    
    String randChar;
    String prompt;
    //private final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyz";
    Random c = new Random();
    
    public String getRandChar(){
        
        return String.valueOf((char)(c.nextInt(95)+32));
    }
    
    public void setRandChar(String p){
        
        prompt = p;
    }
/*
    // returns lowercase alpha  
    public String getRandAlpha(){

        return String.valueOf((char)(c.nextInt(26)+'a'));
    } 
    // returns ASCII printable character (char)    
    public String getRandAlphaNum(){

        return String.valueOf((char)(c.nextInt(95)+32));
    } 
    /* returns alphanum character
    private static String getRandomAlphaNum() {

        int offset = c.nextInt(CHARS.length());
        return CHARS.substring(offset, offset+1);
    } */
}
