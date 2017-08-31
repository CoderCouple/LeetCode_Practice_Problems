package Top100LikedQuestions;

public class MajorityElement {

	// Reference : http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
	public static int majorityElement(int[] nums) {
		if (nums.length == 0)
			return -1;

		int majorityElement = nums[0];
		int frequency = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == majorityElement)
				frequency++;
			else if (frequency == 0) {
				majorityElement = nums[i];
				frequency++;

			} else
				frequency--;
		}

		return majorityElement;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 1, 1, 1, 4, 5, 1, 1, 1, 4 };
		System.out.println("Majority Element is : " + majorityElement(array));
	}

}
