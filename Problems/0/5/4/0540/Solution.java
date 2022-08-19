//给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
//
// 请你找出并返回只出现一次的那个数。
//
// 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
//
//
//
// 示例 1:
//
//
//输入: nums = [1,1,2,3,3,4,4,8,8]
//输出: 2
//
//
// 示例 2:
//
//
//输入: nums =  [3,3,7,7,10,11,11]
//输出: 10
//
//
//
//
//
//
// 提示:
//
//
// 1 <= nums.length <= 10⁵
// 0 <= nums[i] <= 10⁵
//
// Related Topics 数组 二分查找 👍 364 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] numsGlobal;

    private int binarySearch(int l, int r) {
        if (r - l < 2) return l;
        int m = l + (r - l) / 2;
        if (m % 2 != 0) {
            if (numsGlobal[m] == numsGlobal[m + 1]) {
                return binarySearch(l, m);
            } else return binarySearch(m, r);
        } else {
            if (numsGlobal[m] == numsGlobal[m + 1]) {
                return binarySearch(m, r);
            } else return binarySearch(l, m);

        }
    }

    public int singleNonDuplicate(int[] nums) {
        numsGlobal = nums;
        int nl = binarySearch(0, nums.length - 1);
        if (nl == 0)
            return nums[0];
        if (nums[nl] == nums[nl - 1]) {
            return nums[nl + 1];
        } else return nums[nl];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
