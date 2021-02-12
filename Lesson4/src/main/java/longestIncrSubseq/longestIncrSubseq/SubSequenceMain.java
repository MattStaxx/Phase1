package longestIncrSubseq;

public class SubSequenceMain {


	public static void main(String[] args) {
		int n = 100;

		ReferenceList tal = new ReferenceList(n);

		tal.generateSequence();
		tal.compare();
	}
}