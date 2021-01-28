package calc;

import java.util.Scanner;

/**
 *
 * @author Matt
 */

public class Calculator {
    
    public static void main(String[] args) {
    // variables for values, an operator, and a result 
        double num1;
        double num2;
        String oper;
        double result = 0;
	
    // scanner obj to accept user input
	Scanner in = new Scanner(System.in);
	
    // prompt to user and acceptance of first number
	System.out.print("Enter the first number >> ");
	num1 = in.nextDouble();
        in.nextLine();
	
    // prompt to user and acceptance of the operator to be used
	System.out.print("Enter your desired operator >> ");
	oper = in.nextLine();
	
    // prompt to user and acceptance of second number
	System.out.print("Enter the second number >> ");
	num2 = in.nextDouble();
        
    // switch statement to determine which operator to use for calculating
    // and conducting operations to provide correct result
    switch(oper){
    	case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;
            break;
        default:
            System.out.println("Invalid operator");
        }
        // print result message
    System.out.println("The result is >> " + result);
    in.close();
    }
    
}
