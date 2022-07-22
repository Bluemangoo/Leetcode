//一个整数区间 [a, b] ( a < b ) 代表着从 a 到 b 的所有连续整数，包括 a 和 b。
//
// 给你一组整数区间intervals，请找到一个最小的集合 S，使得 S 里的元素与区间intervals中的每一个整数区间都至少有2个元素相交。
//
// 输出这个最小集合S的大小。
//
// 示例 1:
//
// 输入: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
//输出: 3
//解释:
//考虑集合 S = {2, 3, 4}. S与intervals中的四个区间都有至少2个相交的元素。
//且这是S最小的情况，故我们输出3。
//
//
// 示例 2:
//
// 输入: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
//输出: 5
//解释:
//最小的集合S = {1, 2, 3, 4, 5}.
//
//
// 注意:
//
//
// intervals 的长度范围为[1, 3000]。
// intervals[i] 长度为 2，分别代表左、右边界。
// intervals[i][j] 的值是 [0, 10^8]范围内的整数。
//
//
// Related Topics 贪心 数组 排序 👍 98 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int ans = 2;
        int left = intervals[intervals.length - 1][0];
        int right = left + 1;
        for (int i = intervals.length - 2; i >= 0; i--) {
            if (intervals[i][1] >= right) {
                continue;
            }
            if (intervals[i][1] < left) {
                ans += 2;
                left = intervals[i][0];
                right = left + 1;
                continue;
            }
            right = left;
            left = intervals[i][0];
            ans++;
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
