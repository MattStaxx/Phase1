package fixthebugs;

import java.util.ArrayList;
import java.util.Scanner;

public class FixTheBugs {

    private static ArrayList<Integer> expenses = new ArrayList<Integer>();
	private static Options op = new Options();
    
    public static void main(String[] args) {

        expenses.add(750);
        expenses.add(500);
        expenses.add(49205);
        expenses.add(28041);
        expenses.add(6975);
    	op.setExpenses(expenses);
        System.out.println("\n**************************************");
        System.out.println("  Welcome to the Expenditure Manager ");
        System.out.println("**************************************");
        System.out.println("Enter a number from 1 - 6 to get started...\n");
        op.optionsSelection();
    }
}
