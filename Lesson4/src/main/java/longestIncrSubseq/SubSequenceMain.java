package longestIncrSubseq;

import java.util.ArrayList;

public class SubSequenceMain {


	public static void main(String[] args) {
		int n = 10;
		//int[] arr = {5, 3, 25, 17, 8, 42, 4, 9, 31, 12, 50};
		ReferenceList tal = new ReferenceList(n);
		//ArrayList<Integer> al = new ArrayList<Integer>();
		tal.generateSequence();
		//System.out.println(tal.getTa() + " ta");
		//System.out.println();
		tal.compare();
		

	}
}

/*
 * int a = 0;
		int b = 0;
	int tmp1 = 0;
	int tmp2 = 0;
		int tmp3 = 0;
		int tmpVal; 
		int count = 0;
		int[] arr = {5, 3, 25, 17, 8, 42, 4, 9, 31, 12, 50}; // [11]
		
	ArrayList<Integer> tl = new ArrayList<Integer>();
		LongestSubsequence ls = new LongestSubsequence();

		do	
			for(int i = 0; i < arr.length; i++) {
				a = arr[i];
				b = arr[i];

				if(b >= arr.length) { 
					b = arr[i];
					ls.setTmp2(b);
				}
					else if(b < arr.length) { 
						b = arr[i + 1];
						ls.setTmp2(b);
				}

				count = i + 1;

				a = ls.getTmp1();
				b = ls.getTmp2();
				tmp3 = b;
				
				if(count == 1 || ls.size() == 0) {
					ls.add(a);
				}

				System.out.println("Start of new loop: " + tl + " tmp1 = " + tmp1 + " tmp2 = " + tmp2 + " b: " + b) ;

				if(tmp1 < tmp2) {
					tl.add(tmp3);
					System.out.println(tl);
				}else if(tmp1 >= tmp2) {
					tl.clear();
					System.out.println("Clearing list: \n");
				}
					
				tmpVal = tl.size();
				System.out.println("List size: " + tmpVal + " ' " + tl + " loop count " + count);	
			
			}while(b < arr.length);
 */