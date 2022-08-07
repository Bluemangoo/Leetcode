import java.util.ArrayList;
import java.util.List;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        if(nums.length<3){
            return 0;
        }
        int ans=0;
        List<Integer> list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i=0;i<nums.length-2;i++){
            if (list.contains(nums[i]+diff)&&list.contains(nums[i]+2*diff)){
                ans++;
            }
        }
        return ans;
    }
}