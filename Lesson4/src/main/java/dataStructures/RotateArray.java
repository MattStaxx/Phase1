package dataStructures;

import java.util.Arrays;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		
		if(k > nums.length) 
   			k = k % nums.length;
 			int[] result = new int[nums.length];
	 		for(int i = 0; i < k; i++){
    			result[i] = nums[nums.length - k + i];
	 		}
	 		int j = 0;
	    		for(int i = k; i < nums.length; i++){
        			result[i] = nums[j];
        			j++;
	    		}
	    		System.arraycopy( result, 0, nums, 0, nums.length );
	}
	
	public int kthSmallestNumber(int[] nums, int k) {
		
		Arrays.sort(nums);
		return nums[k];
	}
}
