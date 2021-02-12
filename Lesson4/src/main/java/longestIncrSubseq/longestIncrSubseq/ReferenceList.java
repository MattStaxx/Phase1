package longestIncrSubseq;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ReferenceList {
	
	private int n;
	
	private ArrayList<Integer> al = new ArrayList<Integer>();
	private ArrayList<Integer> ta = new ArrayList<Integer>();
	private ArrayList<Integer> lrgSub = new ArrayList<Integer>();
	
	public ReferenceList(int n) {
		this.n = n;
	}

	public ReferenceList(ArrayList<Integer> al) {
		this.al = al;
	}
	
	public ArrayList<Integer> generateSequence() {
		al.clear();
		for(int i = 0; i < n; i++) {
			al.add(ThreadLocalRandom.current().nextInt(0, n + 1));
		}
		setAl(al);
		return this.al;
	}

	public ArrayList<Integer> getAl() {
		return al;
	}

	public void setAl(ArrayList<Integer> al) {
		System.out.println(al.subList(0, 19) + " ...cont'd on new line");
		System.out.println(al.subList(20, 39) + " ...cont'd on new line");
		System.out.println(al.subList(40, 59) + " ...cont'd on new line");
		System.out.println(al.subList(60, 79) + " ...cont'd on new line");
		System.out.println(al.subList(80, 99) + " << Random sequence to be searched...\n");
		this.al = al;
	}
	public ArrayList<Integer> getTa() {
		//setTa(al);
		return this.ta;
	}
	public void compare() {
		int i;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3;

		ArrayList<Integer> t2 = new ArrayList<Integer>();

		do
			for(i = 0; i < 99; i++) {
				tmp1 = Integer.valueOf(al.get(i));
				if(i >= al.size()) 
					tmp2 = Integer.valueOf(al.get(i));
				else if(i < al.size())
						tmp2 = Integer.valueOf(al.get(i + 1));
				
				tmp3 = tmp2;
				if(i == 0 || t2.size() == 0) {
					t2.add(tmp1);
					//System.out.println(t2);
					//System.out.println(t2 + " t2 step1" + " t1 " + tmp1 + " t2 " + tmp2 + " c:" + count);
				}
				if(Integer.compare(tmp1, tmp2) < 0) {
					t2.add(tmp3);
					//System.out.println(t2);
					//System.out.println(t2 + " t2 step2" + " t1 " + tmp1 + " t2 " + tmp2 + " c:" + count);
				}
				else if(Integer.compare(tmp1, tmp2) >= 0) {
					t2.clear();
					//System.out.println(t2);
					//System.out.println(t2 + " Clear:" + " t1 " + tmp1 + " t2 " + tmp2 + " c:" + count);
				}
				if(t2.size() > lrgSub.size()) {
					lrgSub.clear();
					lrgSub.addAll(t2);
				}
				
			}while (i < 99);
		System.out.println("The longest subsequence is " + lrgSub.size() 
							+ " elements long, and contains the elements: " + lrgSub.clone());
	}
}