package Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static int findUnsortedSubarray(int[] nums) {

		int result = 0;
		int lowerIndex = 0;
		int upperIndex = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int resultLowerIndex = 0;
		int resultUpperIndex = 0;

		if (nums.length <= 0)
			return result;

		
		
		for (int i = 0; i < nums.length - 1; i++) {
			lowerIndex = i;
			if (nums[i] > nums[i + 1])
				break;
		}

		for (int i = nums.length - 1; i > 0; i--) {
			upperIndex = i;
			if (nums[i] < nums[i - 1]) 
				break;
		}

		if(lowerIndex>=upperIndex || upperIndex-lowerIndex<2)
			return 0;
		
		for (int i = lowerIndex; i <= upperIndex; i++) {
			if (nums[i] < min)
				min = nums[i];

			if (nums[i] > max)
				max = nums[i];
		}

		for (int i = 0; i <= lowerIndex; i++) {
			if (min < nums[i]) {
				resultLowerIndex = i;
				break;
			}

		}

		for (int i = nums.length - 1; i >= upperIndex; i--) {
			if (max > nums[i]) {
				resultUpperIndex = i;
				break;
			}
		}

		return resultUpperIndex - resultLowerIndex + 1;
	}

	public static void main(String[] args) {
		int array[] = {1,2};
		System.out.println(findUnsortedSubarray(array));

	}

}
