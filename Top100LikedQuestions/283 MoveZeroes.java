package Top100LikedQuestions;

import java.util.Arrays;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		if (nums.length == 0)
			return;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0)
				move(nums, i);
		}
	}

	public static void move(int nums[], int index) {
		while (index < nums.length - 1) {
			int temp = nums[index];
			nums[index] = nums[index + 1];
			nums[index + 1] = temp;
			index++;
		}
	}

	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 3, 12 };
		moveZeroes(array);
		System.out.println(Arrays.toString(array));
	}

}
