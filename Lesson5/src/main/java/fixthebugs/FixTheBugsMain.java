package fixthebugs;

import java.util.ArrayList;

public class FixTheBugsMain {

    private static ArrayList<Integer> expenses = new ArrayList<Integer>();
	private static Options op = new Options();
    
	// Application main method
    public static void main(String[] args) {

    	// Values to initialize the expense List
        expenses.add(750);
        expenses.add(500);
        expenses.add(49205);
        expenses.add(28041);
        expenses.add(6975);
    	op.setExpenses(expenses);
    	// Welcome message and user prompt
        System.out.println("\n**************************************");
        System.out.println("  Welcome to the Expense Manager ");
        System.out.println("**************************************");
        System.out.println("Enter a number from 1 - 6 to get started...\n");
        // call to begin the option selection functionality
        op.optionsSelection();
    }
}