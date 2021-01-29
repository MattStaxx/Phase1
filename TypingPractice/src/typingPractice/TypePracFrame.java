/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class TypePracFrame extends JFrame implements KeyListener{
    
    JLabel prompt = new JLabel(" ");
    JLabel outLabel = new JLabel(" ");
    JTextField field = new JTextField(5);
    
    
    public TypePracFrame(){
        super("Typing Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(prompt, BorderLayout.NORTH);
        add(outLabel, BorderLayout.SOUTH);
        add(field, BorderLayout.CENTER);
        character();
        addKeyListener(this);
        field.addKeyListener(this);
        
        
    }
    
    public void character(){
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
        }
        
    }
    
    @Override
    public void keyTyped(KeyEvent e){
      char c = e.getKeyChar();
      outLabel.setText("You entered >>  " + c);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
   
}




// "Type the " + "' " +   +  " '" + " key"