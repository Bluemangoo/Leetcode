import java.util.Arrays;

class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] count1=new int[edges.length];
        Arrays.fill(count1, -1);
        int k=0;
        while (count1[node1]==-1){
            if (edges[node1]==-1){
                count1[node1]=k;
                break;
            }
            count1[node1]=k++;
            node1=edges[node1];
        }
        int[] count2=new int[edges.length];
        Arrays.fill(count2, -1);
        k=0;
        while (count2[node2]==-1){
            if (edges[node2]==-1){
                count2[node2]=k;
                break;
            }
            count2[node2]=k++;
            node2=edges[node2];
        }
        int min=-1;
        int minPoint=-1;
        for (int i=0;i<edges.length;i++){
            if (count1[i]!=-1&&count2[i]!=-1){
                int max = Math.max(count1[i], count2[i]);
                if(min==-1||min> max){
                    min= max;
                    minPoint=i;
                }
            }
        }
        return minPoint;
    }
}