package fixthebugs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Class to prompt and provide user with options for accessing application functionality
public class Options {

	int options;
    private static final int QUIT = 6;
    
	private ArrayList<Integer> expenses = new ArrayList<Integer>();
    private static Scanner sc = new Scanner(System.in);
    
    // Method to prompt for, and receive user input based on user's desired action
	public void optionsSelection() throws InputMismatchException {
		
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application",
        };
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        System.out.print("\nEnter your choice:  ");
        try {
        	options =  sc.nextInt();
        } catch(InputMismatchException ime) {
        	System.out.println("Invalid input!!\nEnsure your selection is a number from 1 - 6");
        	options = QUIT;
        	}
        do {
        switch(options) {
            case 1:
            	System.out.println("Your saved expenses are listed below: \n");
                System.out.println(getExpenses() + "\n");
                System.out.println("Please make another selection...");
                optionsSelection();
                break;
            case 2:
                System.out.print("Enter the value to add your expenses: ");
                try {
                	int value =  sc.nextInt();
                    expenses.add(value);
                } catch(InputMismatchException ime) {
                	System.out.println("\nInvalid input!!\nEnsure your input is a number...");
                	options = QUIT;
                	}
                System.out.println("Your expenses have been updated\n");
                System.out.println(getExpenses() + "\n");
                System.out.println("Please make another selection...");
                optionsSelection();
                break;
            case 3:
                System.out.print("You are about the delete all your expenses! \nConfirm delete by selecting '3' again >>  ");
                int con_choice = sc.nextInt();
                if(con_choice == options){
                	expenses.clear();
                    System.out.println(getExpenses() + "\n");
                    System.out.println("All your expenses are erased!\n");
                } else {
                    System.out.println("Oops... try again!");
                }
                System.out.println("Please make another selection...");
                optionsSelection();
                break;
            case 4:
                sortExpenses(getExpenses());
                System.out.println("Please make another selection...");
                optionsSelection();
                break;
            case 5:
                searchExpenses(getExpenses());
                System.out.println("Please make another selection...");
                optionsSelection();
                break;
            case 6:
                closeApp();
                break;
            default:
                System.out.println("You have made an invalid selection!");
                System.out.println("Quitting Expense Manager... \nThank you!");
                options = QUIT;
                break;   
        	}
        } while(options != QUIT);
    }

	// Method to retrieve expense List 
    public ArrayList<Integer> getExpenses() {
    	
		return expenses;
	}

    // Method to set the values of the expense List
	public void setExpenses(ArrayList<Integer> expenses) {
		
		this.expenses = expenses;
	}

	// Method to export the initial List as well as any updated Lists to the sort class
    private ArrayList<Integer> sortExpenses(ArrayList<Integer> arrayList) {

		int n = expenses.size();
    	Sort qs = new Sort(expenses);
    	qs.startQuickSort(0, n - 1);
    	qs.printArray();
		return expenses;
    }
    
    // Method to export the initial List as well as any updated Lists to the search class
    private static void searchExpenses(ArrayList<Integer> expenses) {
    	
    	Search sear = new Search();
        System.out.print("Enter the expense you want to search:  ");
        int numToSearch = sc.nextInt();
        sear.linearSearch(expenses, numToSearch);
    }

    // Method to close the application safely
	private static void closeApp() {
		
        System.out.println("Quitting Expense Manager... \nThank you!");
    }
}
