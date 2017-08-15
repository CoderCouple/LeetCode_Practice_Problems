package Recursion;

public class NumberOfIslands {

	public static int numIslands(char[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[0].length; j++)
				if (grid[i][j] == '1') {
					getIlands(i, j, grid);
					result++;
				}
		return result;
	}

	public static void getIlands(int col, int row, char[][] grid) {
		if (row < 0 || row >= grid[0].length || col < 0 || col >= grid.length)
			return;

		if (grid[col][row] == '5' || grid[col][row] == '0')
			return;

		grid[col][row] = '5';

		getIlands(col, row + 1, grid);
		getIlands(col, row - 1, grid);
		getIlands(col + 1, row, grid);
		getIlands(col - 1, row, grid);

		return;
	}

	public static void main(String[] args) {
		char grid[][] = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		
		System.out.println(numIslands(grid));

	}

}
