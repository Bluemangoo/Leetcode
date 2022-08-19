//给你一个大小为 m x n 的二进制矩阵 grid ，其中 0 表示一个海洋单元格、1 表示一个陆地单元格。
//
// 一次 移动 是指从一个陆地单元格走到另一个相邻（上、下、左、右）的陆地单元格或跨过 grid 的边界。
//
// 返回网格中 无法 在任意次数的移动中离开网格边界的陆地单元格的数量。
//
//
//
// 示例 1：
//
//
//输入：grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
//输出：3
//解释：有三个 1 被 0 包围。一个 1 没有被包围，因为它在边界上。
//
//
// 示例 2：
//
//
//输入：grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
//输出：0
//解释：所有 1 都在边界上或可以到达边界。
//
//
//
//
// 提示：
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 500
// grid[i][j] 的值为 0 或 1
//
// Related Topics 深度优先搜索 广度优先搜索 并查集 数组 矩阵 👍 108 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] data;
    int xMax, yMax;

    private void dfs(int x, int y) {
        if (data[x][y] == 0) {
            return;
        }
        data[x][y] = 0;
        if (x != 0) {
            dfs(x - 1, y);
        }
        if (x != xMax) {
            dfs(x + 1, y);
        }
        if (y != 0) {
            dfs(x, y - 1);
        }
        if (y != yMax) {
            dfs(x, y + 1);
        }
    }

    public int numEnclaves(int[][] grid) {
        data = grid;
        xMax = grid.length - 1;
        yMax = grid[0].length - 1;
        for (int i = 0; i <= xMax - 1; i++) {
            dfs(i, 0);
            dfs(i, yMax);
        }
        for (int i = 0; i <= yMax - 1; i++) {
            dfs(0, i);
            dfs(xMax, i);
        }
        data[xMax][yMax] = 0;
        int n = 0;
        for (int i = 0; i <= xMax; i++) {
            for (int j = 0; j <= yMax; j++) {
                n += data[i][j];
            }
        }
        return n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
