package Top100LikedQuestions;

import java.lang.Thread.State;

public class MaximumSubarray {

	// Reference: http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	public static int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;

		int local_max = nums[0];
		int global_max = nums[0];
		int start = 0;
		int end = 0;
		int gm;
		for (int i = 1; i < nums.length; i++) {
			local_max = Math.max(nums[i], local_max + nums[i]);
			gm = global_max;
			global_max = Math.max(local_max, global_max);
			if (gm < global_max)
				end = i;
		}
		
		int sum = 0;
		for (int j = end; j >= 0; j--) {
			sum = sum + nums[j];
			if (sum == global_max)
				start = j;

		}

		System.out.println(start + " " + end);
		return global_max;
	}

	public static void main(String[] args) {
		int array[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(array));

	}

}
