package Top100LikedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int array[] = { -1, -1 };

		if (nums.length <= 0)
			return array;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int result[] = { map.get(target - nums[i]), i };
				array = result;
				return array;
			}

			map.put(nums[i], i);
		}

		return array;
	}

	public static void main(String[] args) {
		int array[] = { 3, 2, 4 };
		int k = 6;
		System.out.println(Arrays.toString(twoSum(array, k)));

	}

}
