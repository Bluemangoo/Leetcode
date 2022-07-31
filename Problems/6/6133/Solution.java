class Solution {
    public int maximumGroups(int[] grades) {
        int length=grades.length;
        int n=0;
        while (length>n){
            length-=++n;
        }
        return n;
    }
}