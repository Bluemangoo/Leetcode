import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int longestCycle(int[] edges) {
        int[] inDegree=new int[edges.length];
        boolean[] used=new boolean[edges.length];
        int ans=-1;
        for (int i:edges){
            if(i!=-1){
                inDegree[i]++;
            }
        }
        Deque<Integer> stack= new ArrayDeque<>();
        for (int i=0;i<inDegree.length;i++){
            if (inDegree[i]==0){
                stack.addLast(i);
            }
        }
        while (!stack.isEmpty()){
            int now=stack.pollLast();
            used[now]=true;
            if (edges[now]!=-1){
                inDegree[edges[now]]--;
                if(inDegree[edges[now]]==0){
                    stack.addLast(edges[now]);
                }
            }
        }
        for (int i=0;i<edges.length;i++){
            if (used[i]){
                continue;
            }
            int count=0;
            int k=i;
            while(!used[k]){
                count++;
                used[k]=true;
                k=edges[k];
            }
            if (count>ans){
                ans=count;
            }
        }
        return ans;
    }
}