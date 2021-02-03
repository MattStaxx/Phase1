/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Matt
 */
public class Result {
    
    double num1;
    double num2;
    String op;
    double result;
    
    public void setNum1(double n){
        num1 = n;
    }
    
    public void setNum2(double n){
        num2 = n;
    }
    
    public void setOp(String o){
        op = o;
    }
    /*
    public double getResult(double n, double N, String o){
        
        setNum1(num1);
        setNum2(num2);
        setOp(op);
        if (op.equals("+"))
            result = num1 + num2;
        if (op.equals("-"))
            result = num1 - num2;
        if (op.equals("*"))
            result = num1 * num2;
        if (op.equals("/"))
            result = num1 / num2;
        else
            System.out.println("invalid operator");
        return result;
    }*/
    
    public void printResult(){
        System.out.println(result);
    }
}
