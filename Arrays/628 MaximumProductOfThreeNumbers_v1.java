package Arrays;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);

		int product1 = 1;
		for (int i = 0; i < 2; i++) {
			product1 = product1 * nums[i];
		}

		product1 = product1 * nums[nums.length - 1];

		int product2 = 1;
		for (int i = nums.length - 1; i >= nums.length - 3; i--) {
			product2 = product2 * nums[i];
		}

		return Math.max(product1, product2);
	}

	public static void main(String[] args) {
		int array[] = { -1, -2, -3, -4, 60 };
		System.out.println(maximumProduct(array));

	}

}
