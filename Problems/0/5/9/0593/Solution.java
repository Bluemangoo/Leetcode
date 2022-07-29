//给定2D空间中四个点的坐标 p1, p2, p3 和 p4，如果这四个点构成一个正方形，则返回 true 。
//
// 点的坐标 pi 表示为 [xi, yi] 。输入 不是 按任何顺序给出的。
//
// 一个 有效的正方形 有四条等边和四个等角(90度角)。
//
//
//
// 示例 1:
//
//
//输入: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
//输出: True
//
//
// 示例 2:
//
//
//输入：p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,12]
//输出：false
//
//
// 示例 3:
//
//
//输入：p1 = [1,0], p2 = [-1,0], p3 = [0,1], p4 = [0,-1]
//输出：true
//
//
//
//
// 提示:
//
//
// p1.length == p2.length == p3.length == p4.length == 2
// -10⁴ <= xi, yi <= 10⁴
//
//
// Related Topics 几何 数学 👍 123 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    double a = 0, b = 0;
    int[][][] points = new int[4][][];
    int[][][] pointsTmp = new int[4][][];
    int k = 0, k2 = 0;

    boolean test(int[] p1, int[] p2) {
        double len = Math.sqrt((p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]));
        if (a == 0) {
            a = len;
            if (k == 4) {
                return false;
            }
            points[k++] = new int[][]{p1, p2};
            return true;
        } else if (a == len) {
            if (k == 4) {
                return false;
            }
            points[k++] = new int[][]{p1, p2};
            return true;
        } else if (b == 0) {
            if (k2 == 4) {
                return false;
            }
            b = len;
            pointsTmp[k2++] = new int[][]{p1, p2};
            return true;
        } else if (b == len) {
            if (k2 == 4) {
                return false;
            }
            pointsTmp[k2++] = new int[][]{p1, p2};
            return true;
        }
        return false;
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (!(test(p1, p2) && test(p2, p3) && test(p3, p4) && test(p1, p4) && test(p1, p3) && test(p2, p4))) {
            return false;
        }
        double[] innerPoint;
        if (b == 0) {
            return false;
        }
        if (a > b) {
            innerPoint = new double[]{(double) (points[0][0][0] + points[0][1][0]) / 2, (double) (points[0][0][1] + points[0][1][1]) / 2};
            points = pointsTmp;
            a = b;
        } else {
            innerPoint = new double[]{(double) (pointsTmp[0][0][0] + pointsTmp[0][1][0]) / 2, (double) (pointsTmp[0][0][1] + pointsTmp[0][1][1]) / 2};
        }
        if (points[3] == null) {
            return false;
        }
        double s = a * a / 4;
        s = (float) s;
        for (int[][] group : points) {
            if (Math.abs((group[0][0] - innerPoint[0]) * (group[1][1] - innerPoint[1]) - (group[0][1] - innerPoint[1]) * (group[1][0] - innerPoint[0])) / 2 != s) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
