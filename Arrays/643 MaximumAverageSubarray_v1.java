package Arrays;

public class MaximumAverageSubarray {

	public static double findMaxAverage(int[] nums, int k) {

		if (nums.length < k) {
			double sum = 0;
			for (int p = 0; p < nums.length; p++) {
				sum = sum + nums[p];
			}
			return sum / nums.length;
		}
		double maxavg = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - k; i++) {
			double avg = 0;
			double sum = 0;
			for (int j = i; j < k + i; j++) {
				sum = sum + nums[j];
			}
			avg = sum / k;
			if (avg > maxavg)
				maxavg = avg;

		}
		return maxavg;
	}

	public static void main(String[] args) {
		int array[] = { 7, 4, 5, 8, 8, 3, 9, 8, 7, 6 };
		System.out.println(findMaxAverage(array, 7));
	}

}
