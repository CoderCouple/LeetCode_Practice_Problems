package Recursion;

public class Search2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0)
			return false;
		int result = 0;
		int lowbound = 0;
		int upbound = matrix.length - 1;
		int mid = (lowbound + upbound) / 2;
		while (lowbound <= upbound) {
			if (matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length - 1]) {
				result = binarySearch(matrix[mid], target, 0, matrix[mid].length - 1);
				if (result == target)
					return true;
				else
					return false;
			}

			if (target < matrix[mid][0]) {
				upbound = mid - 1;
				mid = (lowbound + upbound) / 2;
			} else if (matrix[mid][matrix[mid].length - 1] < target) {
				lowbound = mid + 1;
				mid = (lowbound + upbound) / 2;
			}

		}
		return false;
	}

	public static int binarySearch(int myArray[], int n, int startNum, int endNum) {
		if (startNum > endNum)
			return -1;

		int midNum = (startNum + endNum) / 2;

		if (n == myArray[midNum])
			return myArray[midNum];

		if (n < myArray[midNum])
			return binarySearch(myArray, n, startNum, midNum - 1);
		else
			return binarySearch(myArray, n, midNum + 1, endNum);

	}

	public static void main(String[] args) {
		int array[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int k = 3;

		System.out.println("Is element present : " + searchMatrix(array, k));

	}

}
