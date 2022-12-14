package org.geekbrains;

import java.util.Arrays;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

//        int[][] grid = {{1,1,0,0,0},
//                        {1,1,0,0,0},
//                        {0,0,0,1,1},
//                        {0,0,0,1,1}};

        Solution Sol = new Solution();
        int maxArea = Sol.maxAreaOfIsland(grid);
        out.println(maxArea);
        for (int[] ints : grid) {
            out.println(Arrays.toString(ints));
        }
    }
}