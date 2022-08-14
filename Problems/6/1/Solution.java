class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] list = new int[][]{{0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        int[][] ans = new int[grid.length - 2][grid[0].length - 2];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                ans[i - 1][j - 1] = grid[i - 1][j - 1];
                for (int[] k : list) {
                    if (grid[i + k[0]][j + k[1]] > ans[i - 1][j - 1]) {
                        ans[i - 1][j - 1] = grid[i + k[0]][j + k[1]];
                    }
                }
            }
        }
        return ans;
    }
}