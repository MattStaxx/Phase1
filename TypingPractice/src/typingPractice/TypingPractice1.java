/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingPractice;
import java.awt.event.KeyEvent;
import javax.swing.*;
//import java.util.Scanner;
/**
 * 12-15-2020                             base functions = 6.0 hrs / QOL implements = 3.0 hrs / advanced functions = 0.0 hrs
 * @author Matt
 */
public class TypingPractice1 extends JFrame{
    
    public static void main (String[] args){
        
        TypePracFrame aFrame = new TypePracFrame(); 
                
        final int WIDTH = 300;
        final int HEIGHT = 150;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        
        /*
        String character;
        String attempt;
        String user;
        int lc = 0;
        RandomCharacter rc = new RandomCharacter();
        Scanner in = new Scanner(System.in);
        System.out.print("Press enter to begin >>  ");
        user = in.nextLine();
        
        while(lc < 5){
            rc.setRandChar(user);
            character = rc.getRandChar();   
            System.out.println("Rand Char: " + character);
            System.out.println("Press the " + " ' " + character + " ' " + " key.");
            attempt = in.nextLine();
            if (attempt.equals(character)){
                System.out.println("Good job!!");
            }    
            else {
                while(!attempt.equals(character)){
                    System.out.println("Incorrect, try again.");
                    System.out.println("*Rand Char: " + character);
                    System.out.println("Press the " + " ' " + character + " ' " + " key.");
                    attempt = in.nextLine();
                    if (attempt.equals(character)){
                        System.out.println("Good job!!");
                    }
                }    
            }
            lc += 1;
        }*/
        
    }
}        
        
        
        
        
        
        
        
        //System.out.println("Random Alpha: " + getRandAlpha());
        //System.out.println("Random AlphaNum: " + getRandAlphaNum());

        
    
        
        
    //BASE FUNCTIONS

        // intro - COMPLETE
        // assign alpha key to be pressed and command user to press the assigned key - COMPLETE
        // receive user input - COMPLETE
        // check input against assingment - COMPLETE
        // produce new assignment if correct, try again message and receive new input if incorrect (loop) - COMPLETE
        
    // QOL IMPLEMENTS

        // user select desired character set (uppercase only/lowercase only/both/numbers/all characters)
        // gui
        // offer kill key

    // ADVANCED FUNCTIONS

        // user input timer
        // smart character assignments (non-random) according to keyboard layout/dictonary words/character sequence
        // file i/o (open app from desktop/user statistics)
