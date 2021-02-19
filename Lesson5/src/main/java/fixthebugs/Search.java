package fixthebugs;

import java.util.ArrayList;

public class Search {
	
	private ArrayList<Integer> arrayList;
	private int num;

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
