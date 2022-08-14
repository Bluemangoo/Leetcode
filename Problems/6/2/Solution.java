class Solution {
    public int edgeScore(int[] edges) {
        long[] sum=new long[edges.length];
        for (int i=0;i<edges.length;i++){
            sum[edges[i]]+=i;
        }
        long max=Integer.MIN_VALUE;
        int p=0;
        for (int i=0;i<sum.length;i++){
            if (sum[i]>max){
                max=sum[i];
                p=i;
            }
        }
        return p;
    }
}