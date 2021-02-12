package dataStructures;

public class ArraysMain {

	public static void main(String[] args) {
		
		final int K = 2;
		RotateArray r = new RotateArray();
		int arr[] = {0, 62, 36, 24, 95, 101, 87};
		
		System.out.println("Before rotation:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		r.rotate(arr, 5); 
		System.out.println("\nAfter rotation:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\nThe " + (K + 1) + "th smallest number is: " + r.kthSmallestNumber(arr, K));
		
	}
}
