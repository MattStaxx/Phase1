package longestIncrSubseq;

public class SubSequenceMain {


	public static void main(String[] args) {
		
		// variable to seed the program with 100 elements and values for those elements
		int n = 100;
		
		// object to access the functionalities of the program
		ReferenceList tal = new ReferenceList(n);

		// method calls for desired actions/outputs
		tal.generateSequence();
		tal.compare();
	}
}