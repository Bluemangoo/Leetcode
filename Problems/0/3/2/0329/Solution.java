//给定一个 m x n 整数矩阵 matrix ，找出其中 最长递增路径 的长度。
//
// 对于每个单元格，你可以往上，下，左，右四个方向移动。 你 不能 在 对角线 方向上移动或移动到 边界外（即不允许环绕）。
//
//
//
// 示例 1：
//
//
//输入：matrix = [[9,9,4],[6,6,8],[2,1,1]]
//输出：4
//解释：最长递增路径为 [1, 2, 6, 9]。
//
// 示例 2：
//
//
//输入：matrix = [[3,4,5],[3,2,6],[2,2,1]]
//输出：4
//解释：最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
//
//
// 示例 3：
//
//
//输入：matrix = [[1]]
//输出：1
//
//
//
//
// 提示：
//
//
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 200
// 0 <= matrix[i][j] <= 2³¹ - 1
//
//
// Related Topics 深度优先搜索 广度优先搜索 图 拓扑排序 记忆化搜索 数组 动态规划 矩阵 👍 670 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int ans = 0;
    int[][] count, matrix;

    int find(int x, int y) {
        int hasChild = 0;
        if (count[x][y] != -1) {
            return count[x][y];
        }
        int thisCount = 0;
        if (x + 1 < matrix.length && matrix[x + 1][y] < matrix[x][y]) {
            thisCount = Math.max(thisCount, find(x + 1, y));
            hasChild = 1;
        }
        if (x - 1 >= 0 && matrix[x - 1][y] < matrix[x][y]) {
            thisCount = Math.max(thisCount, find(x - 1, y));
            hasChild = 1;
        }
        if (y + 1 < matrix[0].length && matrix[x][y + 1] < matrix[x][y]) {
            thisCount = Math.max(thisCount, find(x, y + 1));
            hasChild = 1;
        }
        if (y - 1 >= 0 && matrix[x][y - 1] < matrix[x][y]) {
            thisCount = Math.max(thisCount, find(x, y - 1));
            hasChild = 1;
        }
        count[x][y] = thisCount + hasChild;
        return count[x][y];
    }

    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        count = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                count[i][j] = -1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (count[i][j] == -1) {
                    ans = Math.max(ans, find(i, j));
                }
            }
        }
        return ans + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
