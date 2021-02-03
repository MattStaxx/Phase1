/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Matt
 */

public class Calculator {
    
    public final static void main(String[] args) {
        // variables for values, an operator, and a result 
        double num1 = 0;
        float num1f;
        double num2 = 0;
        float num2f;
        String oper;
        double result = 0;
	
        //scanner obj to accept user input
	Scanner in = new Scanner(System.in);
	
        // prompt to user for, and acceptance of first number
	//System.out.print("Enter the first number, then press enter >> ");
        
        
	System.out.print("Enter the first number, then press enter >> ");
        if (in.hasNextDouble()) {
            num1 = in.nextDouble();
            num1f = (float) num1;
            in.nextLine();
            System.out.println(num1f);
        }
        else {
            System.out.println("Invalid entry...calculation will not be correct!");
            num1f = (float) num1;
            in.nextLine();
        }
        
        // prompt to user and acceptance of the operator to be used
	System.out.print("Enter your desired operator + - * /  then press enter >> ");
	oper = in.nextLine();
	
        // prompt to user for, and acceptance of second number
	System.out.print("Enter the second number, then press enter >> ");
        if (in.hasNextDouble()) {
            num2 = in.nextDouble();
            num2f = (float) num2;
            in.nextLine();
            System.out.println(num2f);
        }
        else {
            System.out.println("Invalid entry...calculation will not be correct!");
            num2f = (float) num2;
            in.nextLine();
        }

        // switch statement to determine which operator to use for calculating
        // and conducting operations to provide correct result
        switch(oper){
            case "+":
                result = num1f + num2f;
                break;
            case "-":
                result = num1f - num2f;
                break;
            case "*":
                result = num1f * num2f;
                break;
            case "/":
                result = num1f / num2f;
                break;
            default:
                System.out.println("**INVAILD OPERATOR - RESULT NOT FOUND!!**");
        
        }
        // print result message
        System.out.println("The result is >> " + result);
    }    
}
