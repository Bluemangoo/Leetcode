class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int en=0;
        int exp=0;
        for (int i=energy.length-1;i>=0;i--){
            en+=energy[i];
            exp-=experience[i];
            exp=Math.max(exp,experience[i]+1);
        }
        int ans=0;
        en+=1;
        if (initialEnergy<en){
            ans+=en-initialEnergy;
        }
        if (initialExperience<exp){
            ans+=exp-initialExperience;
        }
        return ans;
    }
}