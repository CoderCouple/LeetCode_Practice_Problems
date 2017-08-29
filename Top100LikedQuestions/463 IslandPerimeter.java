package Top100LikedQuestions;

public class IslandPerimeter {

	public static int islandPerimeter(int[][] grid) {
		if (grid.length == 0 && grid[0].length == 0)
			return 0;

		for (int row = 0; row < grid.length; row++)
			for (int col = 0; col < grid[row].length; col++)
				if (grid[row][col] == 1)
					return getIslandPerimete(grid, row, col, 1);

		return 0;
	}

	public static int getIslandPerimete(int[][] grid, int row, int col, int prev) {

		if (row < 0)
			return 1;

		if (row >= grid.length)
			return 1;

		if (col < 0)
			return 1;

		if (col >= grid[row].length)
			return 1;

		if (grid[row][col] == 0)
			return 1;

		if (grid[row][col] == -1)
			return 0;

		int left = 0, right = 0, up = 0, down = 0;
		grid[row][col] = -1;
		left = getIslandPerimete(grid, row, col - 1, 1);
		right = getIslandPerimete(grid, row, col + 1, 1);
		up = getIslandPerimete(grid, row - 1, col, 1);
		down = getIslandPerimete(grid, row + 1, col, 1);

		return right + left + up + down;
	}

	public static void main(String[] args) {
		 int array[][] = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, {
		 1, 1, 0, 0 } };
		//int array[][] = { { 1 }, { 0 } };
		System.out.println("Perimeter of the iland is : " + islandPerimeter(array));
	}

}
