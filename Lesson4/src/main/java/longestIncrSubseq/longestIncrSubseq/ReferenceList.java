package longestIncrSubseq;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ReferenceList {
	
	private int n;
	
	private int x = 0;
	private int y = 0;
	private int z = 1;
	private int numLrgSubs = 1;
	
	// arrayList objects ot hold main sequence, the largest sequence, and all sequences that are tied for longest
	private ArrayList<Integer> refList = new ArrayList<Integer>();
	private ArrayList<Integer> lrgSub = new ArrayList<Integer>();
	private ArrayList<Integer> allSubs = new ArrayList<Integer>();
	
	// constructor that seeds the initial list with random values
	public ReferenceList(int n) {
		this.n = n;
	}

	// constructor that creates reference list
	public ReferenceList(ArrayList<Integer> rl) {
		this.refList = rl;
	}

	// method that assigns a random value to each index location, based on the seed from ReferenceList(int n)
	public ArrayList<Integer> generateSequence() {
		refList.clear();
		for(int i = 0; i < n; i++) {
			refList.add(ThreadLocalRandom.current().nextInt(0, n + 1));
		}
		setRefList(refList);
		return this.refList;
	}

	// method that sets the Reference List to a variable for accessibility, as well as outputs the formatted reference list to the user
	public void setRefList(ArrayList<Integer> rl) {
		System.out.println(rl.subList(0, 20) +  " ...100 random integers");
		System.out.println(rl.subList(20, 40) + " ...to be searched for the");
		System.out.println(rl.subList(40, 60) + " ...values that link together");
		System.out.println(rl.subList(60, 80) + " ...to form the longest");
		System.out.println(rl.subList(80, 100) + " ...increasing subsequence\n");
		this.refList = rl;
	}

	// method that compares each pair of values in the reference list, then creates a temporary list to compare 
	// against subsequent lists to determine if a given list is longer than another. also sets all 
	// lists of equivalent length to an additional list in order to have a complete set of "longest lists"
	public void compare() {
		int i;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3;
		int idx = 0;

		ArrayList<Integer> tmpList = new ArrayList<Integer>();

		do
			for(i = 0; i < refList.size() - 1; i++) {
				tmp1 = Integer.valueOf(refList.get(i));
				if(i >= refList.size()) 
					tmp2 = Integer.valueOf(refList.get(i));
				else if(i < refList.size())
						tmp2 = Integer.valueOf(refList.get(i + 1));
				
				tmp3 = tmp2;
				if(i == 0 || tmpList.size() == 0) {
					tmpList.add(tmp1);
				}
					if(Integer.compare(tmp1, tmp2) < 0) {
						tmpList.add(tmp3);
					}
					else 
						tmpList.clear();
					
				// sets the occurrence of the longest subsequence to LrgSub, which is then returned after the while loop ends
				if(tmpList.size() > lrgSub.size()) {
					lrgSub.clear();
					allSubs.clear();
					lrgSub.addAll(0, tmpList);
					allSubs.addAll(0, tmpList);
					numLrgSubs = 1;
				}
					else if(tmpList.size() == lrgSub.size()) {
						idx = tmpList.size();
						allSubs.addAll(idx, tmpList);
						idx = idx + idx;
						numLrgSubs++;
				}
			}while (i < refList.size() - 1);
		
		// print statements that inform user of necessary information regarding output to come
		System.out.println("Note: Subsequences that are the same length will be included for completeness.\n");
		System.out.println("\nThe longest subsequence(s) is/are " + lrgSub.size() 
							+ " elements long, and contains the elements: \n");
		
		// print statement loop that outputs resulting longest lists for user's viewing
		while (numLrgSubs > 0) {
			y = z * lrgSub.size();
			System.out.println(allSubs.subList(x, y));
			x = z * lrgSub.size();
			z++;
			numLrgSubs--;
		}
	}
}
