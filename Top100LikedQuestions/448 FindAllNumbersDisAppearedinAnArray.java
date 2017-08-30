package Top100LikedQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisAppearedinAnArray {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0)
				nums[index] = -nums[index];
		}

		for (int j = 0; j < nums.length; j++)
			if (nums[j] > 0)
				result.add(j + 1);

		return result;

	}

	public static void main(String[] args) {
		int array[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(array));

	}

}
