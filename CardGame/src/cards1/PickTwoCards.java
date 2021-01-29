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
public class PickTwoCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create card object and call print card method
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        Card obj1 = new Card();
        Card obj2 = new Card();
        Card obj3 = new Card();
        
        obj1.getNum();
        obj1.getSuit();
        obj2.getNum();
        obj2.getSuit();
        
        switch(obj1.getNum()){
            case("Ace  "):
                val1 = 1;
                break;
            case("Two  "):
                val1 = 2;
                break;
            case("Three"):
                val1 = 3;
                break;
            case("Four "):
                val1 = 4;
                break;
            case("Five "):
                val1 = 5;
                break;
            case("Six  "):
                val1 = 6;
                break;
            case("Seven"):
                val1 = 7;
                break;
            case("Eight"):
                val1 = 8;
                break;
            case("Nine "):
                val1 = 9;
                break;
            case("Ten  "):
                val1 = 10;
                break;
            case("Jack "):
                val1 = 11;
                break;
            case("Queen"):
                val1 = 12;
                break;
            case("King "):
                val1 = 13;
                break;
        }
        
        switch(obj2.getNum()){
            case("Ace  "):
                val2 = 1;
                break;
            case("Two  "):
                val2 = 2;
                break;
            case("Three"):
                val2 = 3;
                break;
            case("Four "):
                val2 = 4;
                break;
            case("Five "):
                val2 = 5;
                break;
            case("Six  "):
                val2 = 6;
                break;
            case("Seven"):
                val2 = 7;
                break;
            case("Eight"):
                val2 = 8;
                break;
            case("Nine "):
                val2 = 9;
                break;
            case("Ten  "):
                val2 = 10;
                break;
            case("Jack "):
                val2 = 11;
                break;
            case("Queen"):
                val2 = 12;
                break;
            case("King "):
                val2 = 13;
                break;
        }
        
        switch(obj3.getNum()){
            case("Ace  "):
                val3 = 1;
                break;
            case("Two  "):
                val3 = 2;
                break;
            case("Three"):
                val3 = 3;
                break;
            case("Four "):
                val3 = 4;
                break;
            case("Five "):
                val3 = 5;
                break;
            case("Six  "):
                val3 = 6;
                break;
            case("Seven"):
                val3 = 7;
                break;
            case("Eight"):
                val3 = 8;
                break;
            case("Nine "):
                val3 = 9;
                break;
            case("Ten  "):
                val3 = 10;
                break;
            case("Jack "):
                val3 = 11;
                break;
            case("Queen"):
                val3 = 12;
                break;
            case("King "):
                val3 = 13;
                break;
        }
        
        // make sure cards are not idenetical
        if (obj1.getNum().equals(obj2.getNum()) && obj1.getSuit().equals(obj2.getSuit())){
            obj3.getNum();
            obj3.getSuit();
            obj3.printYourCard();
            obj2.printCpuCard();
            System.out.println();
            if(val3 > val2){
            System.out.println("You are the winner!!");
            }
                if(val3 < val2){
                    System.out.println("The CPU is the winner.");
                }
                    if(val3 == val2){
                        System.out.println("Tie...");
                    }
        }
        else{
            obj1.printYourCard();
            obj2.printCpuCard();
            System.out.println();
            if(val1 > val2){
            System.out.println("You are the winner!!");
            }
                if(val1 < val2){
                    System.out.println("The CPU is the winner.");
                }
                    if(val1 == val2){
                        System.out.println("Tie...");
                    }
        }
    }
}
    

