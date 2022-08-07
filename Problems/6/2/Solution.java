import java.util.*;

class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<Integer>[] lists = new List[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[n];
        for (int[] edge : edges) {
            lists[edge[0]].add(edge[1]);
            lists[edge[1]].add(edge[0]);
        }
        Set<Integer> set = new HashSet<>();
        for (int j : restricted) {
            set.add(j);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        int ans = 1;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : lists[cur]){
                if (!set.contains(next)){
                    if(!visited[next]){
                        queue.add(next);
                        visited[next] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}