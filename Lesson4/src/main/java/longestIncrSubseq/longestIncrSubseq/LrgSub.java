package longestIncrSubseq;

import java.util.ArrayList;

public class LrgSub {

	private ArrayList<Integer> lrg;
	private int listSize;

	public LrgSub(ArrayList<Integer> lrg, int ls) {
		this.setLrg(lrg);
		this.setListSize(ls);
		
	}

	public ArrayList<Integer> getLrg() {
		return lrg;
	}

	public void setLrg(ArrayList<Integer> lrg) {
		this.lrg = lrg;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
}
