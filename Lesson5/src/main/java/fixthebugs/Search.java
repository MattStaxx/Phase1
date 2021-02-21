package fixthebugs;

import java.util.ArrayList;

//Method to perform a linear search on the imported ArrayList 
public class Search {
	
	private int num;
	private ArrayList<Integer> arrayList;

	// Method to carry out the search operation, and return found/not found message
	public ArrayList<Integer> linearSearch(ArrayList<Integer> arrl, int num) {

		this.num = num; 
		this.arrayList = arrl;
		if(arrl.contains(num) == false) {
			System.out.println("Expense of " + num + " not found, try again...\n");
			return arrl;
		}
		else
			for(int i : arrl) {
				if(i == num) {
					System.out.println("Expense of " + num + " found.\n");
				}
			}
		return arrl;
	}
}
