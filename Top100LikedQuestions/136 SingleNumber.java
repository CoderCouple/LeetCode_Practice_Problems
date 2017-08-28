package Top100LikedQuestions;

import java.util.Map;
import java.util.HashMap;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		if (nums.length == 0)
			return -1;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
			if (map.containsKey(nums[i]))
				map.remove(nums[i]);
			else
				map.put(nums[i], 1);
		return (int) map.keySet().toArray()[0];
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println(singleNumber(array));
	}

}
