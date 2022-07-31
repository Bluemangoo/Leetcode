class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] has=new boolean[101];
        for (int num:nums){
            has[num]=true;
        }
        int ans=0;
        for (int i=1;i<has.length;i++){
            if (has[i]){
                ans++;
            }
        }
        return ans;
    }
}