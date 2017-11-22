package leetcode.array;

import java.util.Arrays;

/*
	Input: [1,4,3,2]
	
	Output: 4
	Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */
public class ArrayPartition1 {
	public static void main(String args[]) {

		int inputList[] = { 1,0,0,3,6,7};

		System.out.println(arrayPairSum(inputList));
	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);

		int result = 0;
		
		for (int i=0; i < nums.length; i=i+2) {
//			System.out.println(i + ";" + nums[i]);
			result = result+nums[i];
		}
		
//		if (nums.length > 2) {
//			result = nums[0] + nums[2];
//		} else {
//			result = nums[0];
//		}
		
		

		return result;
	}


}
