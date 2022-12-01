package org.geekbrains;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        Integer curArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, curArea);
                    maxArea++;
                }
            }
        }
        return maxArea;
    }

    public void dfs(int[][] grid, int i, int j, Integer curArea) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2;
        curArea++;
        dfs(grid, i - 1, j, curArea);
        dfs(grid, i + 1, j, curArea);
        dfs(grid, i, j - 1, curArea);
        dfs(grid, i, j + 1, curArea);
    }

}
