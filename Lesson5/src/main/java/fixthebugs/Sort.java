package fixthebugs;

import java.util.ArrayList;
import java.util.Random;
 
// Class to perform sort quick sort operation on the ArrayList imported from the Main
public class Sort {
	
	private static ArrayList<Integer> arrayIn = new ArrayList<Integer>();
        
    public Sort(ArrayList<Integer> arrayIn) {
    	
        Sort.arrayIn = arrayIn;
    }
 
    // Begin the quick sort by seeding the partition method
    public void startQuickSort(int start, int end){
    	
        int q;
        if(start < end) {
            q = partition(start, end);
            startQuickSort(start, q);
            startQuickSort(q + 1, end);
        }
    }
 
    // Method to retrieve the sorted List
    public ArrayList<Integer> getSortedArray() {
    	
        return Sort.arrayIn;
    }
 
    // Method to compare values in the List as the partition element organizes the List in ascending order
    int partition(int start, int end) {
    	
        int init = start;
        int length = end;
        Random r = new Random();
        int pivotIndex = nextIntInRange(start, end, r);
        int pivot = arrayIn.get(pivotIndex);
        
        while(true) {
            while(arrayIn.get(length) > pivot && length > start) {
                length--;
            }
            
            while(arrayIn.get(init) < pivot && init < end) {
                init++;
            }
            
            if(init < length) {
                int temp;
                temp = arrayIn.get(init);
                arrayIn.set(init, arrayIn.get(length));
                arrayIn.set(length, temp);
                length--;
                init++;
        	} else {
        		return length;

        	}
        }
    }

    // Method to determine a random integer to use as the pivot
    static int nextIntInRange(int min, int max, Random ran) {
           if (min > max) {
              throw new IllegalArgumentException("Cannot draw random int from invalid range [" + min + ", " + max + "].");
           }
           int diff = max - min;
           if (diff >= 0 && diff != Integer.MAX_VALUE) {
              return (min + ran.nextInt(diff + 1));
           }
           int i;
           do {
              i = ran.nextInt();
           } while (i < min || i > max);
           return i;
        }
    
    // Method to print the sorted result to the console
    public void printArray() {
    	
    	System.out.println(getSortedArray() + "\n");
    }
}
