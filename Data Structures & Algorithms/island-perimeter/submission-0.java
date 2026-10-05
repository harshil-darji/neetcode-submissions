class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // find first land cell
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    return dfs(grid, r, c);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int r, int c) {
        // out of bounds → exposed edge
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 1;
        }
        // water → exposed edge
        if (grid[r][c] == 0) {
            return 1;
        }
        // already visited → don't double count
        if (grid[r][c] == -1) {
            return 0;
        }

        // mark visited
        grid[r][c] = -1;

        // sum all 4 directions
        return dfs(grid, r + 1, c)
             + dfs(grid, r - 1, c)
             + dfs(grid, r, c + 1)
             + dfs(grid, r, c - 1);
    }
}