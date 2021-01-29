/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards1;

/**
 *
 * @author Matt
 */
public class Card {
    //char and int data fields for card values
    private String ch;
    private String num;
    private final int SUITS_IN_DECK = 4;
    private final int CARDS_IN_SUIT = 13;
    private final int val = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    private final int suit = ((int)(Math.random() * 100) % SUITS_IN_DECK + 1);
    
    // get and set methods for both fields
    public String getSuit(){
        setSuit(suit);
        return ch;
    }
    
    public void setSuit(int s){
        
        switch(suit){
            case 1:
                ch = "Clubs";
                break;
            case 2:
                ch = "Diamonds";
                break;
            case 3:
                ch = "Hearts";
                break;
            case 4:
                ch = "Spades";
                break;
        }
    }
    
    public String getNum(){
        setNum(val);
        return num;
    }
    
    public void setNum(int val){
        
        switch(val){
            case 1:
                num = "Ace  ";
                break;
            case 2:
                num = "Two  ";
                break;
            case 3:
                num = "Three";
                break;
            case 4:
                num = "Four ";
                break;
            case 5:
                num = "Five ";
                break;
            case 6:
                num = "Six  ";
                break;
            case 7:
                num = "Seven";
                break;
            case 8:
                num = "Eight";
                break;
            case 9:
                num = "Nine ";
                break;
            case 10:
                num = "Ten  ";
                break;
            case 11:
                num = "Jack ";
                break;
            case 12:
               num = "Queen";
                break;
            case 13:
                num = "King ";
                break;
        }
    }
    
    // print method
    public void printYourCard(){
        System.out.println("Your card is     : " + getNum() + " of " + getSuit());
    }
    public void printCpuCard(){
        System.out.println("The CPU's card is: " + getNum() + " of " + getSuit());
    }
}
