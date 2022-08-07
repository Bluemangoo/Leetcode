class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] find = new boolean[n];
        for (int i = 1; i < n; i++) {
            find[i] = ((i < 2 || find[i - 2]) && nums[i] == nums[i - 1])
                    || (i > 1
                        && (i < 3 || find[i - 3])
                        && ((nums[i] == nums[i - 1] && nums[i] == nums[i - 2])
                            || (nums[i] - 1 == nums[i - 1] && nums[i] - 2 == nums[i - 2])));
        }
        return find[n - 1];
    }
}