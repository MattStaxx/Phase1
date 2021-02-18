package fixthebugs;

import java.util.ArrayList;
import java.util.Scanner;

public class FixTheBugs {

    private static ArrayList<Integer> expenses = new ArrayList<Integer>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        
        int  slen = arr.length;
        for(int i = 0; i < slen; i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("\nEnter your choice:\t");
        int options =  sc.nextInt();
        for(int j = 1; j <= slen; j++){
            if(options == j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice == options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
    }
    private static void closeApp() {
    	
        System.out.println("Closing your application... \nThank you!");
    }
    
    private static void searchExpenses(ArrayList<Integer> expenses) {
    	
    	Search sear = new Search();
        System.out.println("Enter the expense you need to search:\t");
        int numToSearch = sc.nextInt();
        sear.linearSearch(expenses, numToSearch);
    }
    // TODO: handle incorrect user input for opt2 - hangs when user enters an expense value instead of an option (try catch on the switch statement)
    private static ArrayList<Integer> sortExpenses(ArrayList<Integer> arrayList) {

    	final int[] arr = new int[arrayList.size()];
		int idx = 0;
		int n = arr.length;
		
    	QuickSort qs = new QuickSort();
    	
		for(final Integer val : arrayList) {
			arr[idx++] = val;
		}
		
    	qs.sort(arr, 0, n - 1);
    	qs.printArray(arr);
    	System.out.println("\n");
    	expenses.clear();
    	for(int i : arr) {
    		expenses.add(i);
    	}
		return expenses;
    }
}
